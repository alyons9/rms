/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.XmlPersistence;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import model.Food;
import org.xml.sax.SAXException;

/**
 *
 * @author anthonylyons
 */
public class DessertDao {
    private NodeList nl;
    private Document doc;
    
    // Initializes the XML Dom object and parses xml file into a nodelist
    public DessertDao() throws SAXException, ParserConfigurationException{
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder db = dbf.newDocumentBuilder();
            
            doc = db.parse("src/Database/Dessert.xml");
            
            //Gets root element
            Element docEle = doc.getDocumentElement();
            
            //Places Elements with the name plate into a list
            nl = docEle.getElementsByTagName("plate");
            
        } catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
    
        
    }
    
    //Retrieve appetizer from nodelist created in constructor. Search for 
    //item by its name.
    //Pre: takes in the name of an appetizer as parameter
    //Post: Returns a food object with all values from xml file
    public Food getDessertByName(String name){
        Food dessert = new Food();
        if(nl != null && nl.getLength() > 0) {
            for(int i = 0 ; i < nl.getLength();i++) {
                //get the appetizer element
                Element el = (Element)nl.item(i);
                if(getTextValue(el,"name").equals(name)){
                    //get the appetizer object
                    dessert = getDessert(el);
                }

				
            }
            
	}
        
        return dessert;
    }
    
    //Add appetizer to node list then write to the file
    //Pre: name, description,Quantity, price, picture for appetizer parameters
    //Post: add to node list and write to file
    public void addDessert(String dessertName, String dessertDescription,int dessertQuantity,double dessertPrice,String dessertPicture){
        
        //Get root node
        Node root = doc.getDocumentElement();
        
        //Create nodes
        Node plate = doc.createElement("plate");
        Node name = doc.createElement("name");
        Node description = doc.createElement("description");
        Node quantity = doc.createElement("quantity");
        Node price = doc.createElement("price");
        Node picture = doc.createElement("picture");
        
        //Set the value held in each node
        name.setTextContent(dessertName);
        description.setTextContent(dessertDescription);
        quantity.setTextContent(Integer.toString(dessertQuantity));
        price.setTextContent(Double.toString(dessertPrice));
        picture.setTextContent(dessertPicture);
        
        //add the child nodes to the plate node
        plate.appendChild(name);
        plate.appendChild(description);
        plate.appendChild(quantity);
        plate.appendChild(price);
        plate.appendChild(picture);
        
        //add plate node to the root node
        root.appendChild(plate);
        
        try {
            write();//Write the values to the xml file
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(DessertDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(DessertDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //Remove the appetizer from xml file
    //Pre: Name of appetizer
    //Post: delete the element from file
    public void removeDessertByName(String name){
        //Get root element
        Element root = doc.getDocumentElement();
        
        //Put children of root element with name plate into nodelist
        NodeList children = root.getElementsByTagName("plate");
        for(int i=0; i<children.getLength(); i++){
            Element child = (Element)children.item(i); //get 1 child and loop
            
            //Remove this child if its name equals the name given
            if(getTextValue(child,"name").equals(name)){
                    root.removeChild(child);
                }
            
        }
        try {
            write();//Write the undeleted children over the file
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(DessertDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(DessertDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Updates the xml file
    private void write() throws TransformerConfigurationException, TransformerException{
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            //initialize StreamResult with File object to save to file
            StreamResult result = new StreamResult(new FileWriter("src/Database/Dessert.xml"));
            DOMSource source = new DOMSource(doc);
            transformer.transform(source, result);
        } catch (IOException ex) {
            Logger.getLogger(DessertDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //gets the value from an element
    private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nodel = ele.getElementsByTagName(tagName);
		if(nodel != null && nodel.getLength() > 0) {
			Element el = (Element)nodel.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}
    
    //adds the appetizer elements to food object
    private Food getDessert(Element dessertElement){
        String name = getTextValue(dessertElement,"name");
	String Description = getTextValue(dessertElement,"description");
        int quantity = Integer.parseInt(getTextValue(dessertElement, "quantity"));
	Double price = Double.parseDouble(getTextValue(dessertElement, "price"));
        String picture = getTextValue(dessertElement,"picture");

	Food dessert = new Food(name,"Dessert",Description,price,quantity,picture);

	return dessert;
    }
}
