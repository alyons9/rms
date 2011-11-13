/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.XmlPersistence;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Vector;
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
 * @Class Name: AppetizersDao
 * @author anthonylyons
 */
public class AppetizersDao {
    private NodeList nl;
    private Document doc;
    private boolean done;
    
    // Initializes the XML Dom object and parses xml file into a nodelist
    public AppetizersDao() throws SAXException, ParserConfigurationException{
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder db = dbf.newDocumentBuilder();
            
            doc = db.parse("src/Database/Appetizers.xml");
            
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
    public Food getAppetizerByName(String name){
        Food appetizer = new Food();
        if(nl != null && nl.getLength() > 0) {
            for(int i = 0 ; i < nl.getLength();i++) {
                //get the appetizer element
                Element el = (Element)nl.item(i);
                if(getTextValue(el,"name").equals(name)){
                    //get the appetizer object
                    appetizer = getAppetizer(el);
                }

				
            }
            
	}
        
        return appetizer;
    }
    
    public Food[] getAllAppetizers(){
       int numOfElem = nl.getLength();
        Food appetizers[] = new Food[numOfElem];
        if(nl != null && numOfElem > 0) {
            for(int i = 0 ; i < numOfElem;i++) {
                //get the appetizer element
                Element el = (Element)nl.item(i);
                
                    //get the appetizer object
                    appetizers[i] = getAppetizer(el);
                

				
            }
            
	}
        
        return appetizers;
    }
    
    
    //Retrieve appetizer from nodelist created in constructor. Search for 
    //item by its name.
    //Pre: takes in the name of an appetizer as parameter
    //Post: Returns a food object with all values from xml file
    public Vector<Food> getVectorAllAppetizers(){
       int numOfElem = nl.getLength();
        Vector <Food> appetizers = new Vector(numOfElem);
        if(nl != null && numOfElem > 0) {
            for(int i = 0 ; i < numOfElem;i++) {
                //get the appetizer element
                Element el = (Element)nl.item(i);
                
                    //get the appetizer object
                    appetizers.add(i,getAppetizer(el));
                

				
            }
            
	}
        
        return appetizers;
    }
    
    
    
    
    //returns the lenght of nodes
    public int length(){
        int temp = nl.getLength();
        return temp;
    }
    
    //Add appetizer to node list then write to the file
    //Pre: name, description,Quantity, price, picture for appetizer parameters
    //Post: add to node list and write to file
    public void addAppetizer(String appetizerName, String appetizerDescription,int appetizerQuantity,double appetizerPrice,String appetizerPicture){
        
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
        name.setTextContent(appetizerName);
        description.setTextContent(appetizerDescription);
        quantity.setTextContent(Integer.toString(appetizerQuantity));
        price.setTextContent(Double.toString(appetizerPrice));
        picture.setTextContent(appetizerPicture);
        
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
            Logger.getLogger(AppetizersDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(AppetizersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //Remove the appetizer from xml file
    //Pre: Name of appetizer
    //Post: delete the element from file
    public boolean removeAppetizerByName(String name){
        //Get root element
        Element root = doc.getDocumentElement();
        System.out.println("im in the remove App ");
        //Put children of root element with name plate into nodelist
        NodeList children = root.getElementsByTagName("plate");
        for(int i=0; i<children.getLength(); i++){
            Element child = (Element)children.item(i); //get 1 child and loop
            
            //Remove this child if its name equals the name given
            if(getTextValue(child,"name").equals(name)){
                    root.removeChild(child);
                    done =true;
                    System.out.print("im deleting this: "+name);
            }
             
        }
        try {
            write();//Write the undeleted children over the file
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(AppetizersDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(AppetizersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return done;
    }
    
    public boolean setPriceByName(String name, double price){
        for(int i=0;i<nl.getLength();i++){
            Element child = (Element)nl.item(i);
            if(getTextValue(child,"name").equalsIgnoreCase(name)){
                //Set childs price to new price
                setTextValue(child,"price",Double.toString(price));
                System.out.println("Works! "+getTextValue(child,"price"));
                done = true;
                try {
                    write();
                } catch (TransformerConfigurationException ex) {
                    Logger.getLogger(AppetizersDao.class.getName()).log(Level.SEVERE, null, ex);
                } catch (TransformerException ex) {
                    Logger.getLogger(AppetizersDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return done;
        
    }
    
    //Updates the xml file
    private void write() throws TransformerConfigurationException, TransformerException{
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            //initialize StreamResult with File object to save to file
            StreamResult result = new StreamResult(new FileWriter("src/Database/Appetizers.xml"));
            DOMSource source = new DOMSource(doc);
            transformer.transform(source, result);
        } catch (IOException ex) {
            Logger.getLogger(AppetizersDao.class.getName()).log(Level.SEVERE, null, ex);
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
    
    //Set value of field
    private void setTextValue(Element ele, String tagName, String newValue){
        NodeList nodeList = ele.getElementsByTagName(tagName);
        if(nodeList!=null && nodeList.getLength()>0){
            Element el = (Element)nodeList.item(0);
            el.getFirstChild().setNodeValue(newValue);
        }
                
    }
    
    //adds the appetizer elements to food object
    private Food getAppetizer(Element appetizerElement){
        String name = getTextValue(appetizerElement,"name");
	String Description = getTextValue(appetizerElement,"description");
        int quantity = Integer.parseInt(getTextValue(appetizerElement, "quantity"));
	Double price = Double.parseDouble(getTextValue(appetizerElement, "price"));
       String picture = getTextValue(appetizerElement,"picture");

	Food appetizer = new Food(name,"Appetizer",Description,price,quantity,picture);

	return appetizer;
    }

    
}
