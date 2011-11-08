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
import model.Drink;
import model.Food;
import org.xml.sax.SAXException;

/**
 * @Class Name: DrinksDao
 * @author anthonylyons
 */
public class DrinksDao {
    private NodeList nl;
    private Document doc;
    
    // Initializes the XML Dom object and parses xml file into a nodelist
    public DrinksDao() throws SAXException, ParserConfigurationException{
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder db = dbf.newDocumentBuilder();
            
            doc = db.parse("src/Database/Drinks.xml");
            
            //Gets root element
            Element docEle = doc.getDocumentElement();
            
            //Places Elements with the name plate into a list
            nl = docEle.getElementsByTagName("cup");
            
        } catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
    
        
    }
    
    //Retrieve drink from nodelist created in constructor. Search for 
    //item by its name.
    //Pre: takes in the name of an appetizer as parameter
    //Post: Returns a food object with all values from xml file
    public Drink getDrinkByName(String name){
        Drink drink = new Drink();
        if(nl != null && nl.getLength() > 0) {
            for(int i = 0 ; i < nl.getLength();i++) {
                //get the appetizer element
                Element el = (Element)nl.item(i);
                if(getTextValue(el,"name").equals(name)){
                    //get the appetizer object
                    drink = getDrink(el);
                }

				
            }
            
	}
        
        return drink;
    }
    
      public Drink[] getAllDrinks(){
       int numOfElem = nl.getLength();
        Drink drinks[] = new Drink[numOfElem];
        if(nl != null && numOfElem > 0) {
            for(int i = 0 ; i < numOfElem;i++) {
                //get the appetizer element
                Element el = (Element)nl.item(i);
                
                    //get the appetizer object
                    drinks[i] = getDrink(el);
                

				
            }
            
	}
        
        return drinks;
    }
    
      
       //returns the lenght of nodes
    public int length(){
        int temp = nl.getLength();
        return temp;
    }
      
    //Add drink to node list then write to the file
    //Pre: name, description,Quantity, price, picture for drink parameters
    //Post: add to node list and write to file
    public void addDrink(String drinkName, String drinkDescription,int drinkQuantity,double drinkPrice,String drinkPicture){
        
        //Get root node
        Node root = doc.getDocumentElement();
        
        //Create nodes
        Node cup = doc.createElement("cup");
        Node name = doc.createElement("name");
        Node description = doc.createElement("description");
        Node quantity = doc.createElement("quantity");
        Node price = doc.createElement("price");
        Node picture = doc.createElement("picture");
        
        //Set the value held in each node
        name.setTextContent(drinkName);
        description.setTextContent(drinkDescription);
        quantity.setTextContent(Integer.toString(drinkQuantity));
        price.setTextContent(Double.toString(drinkPrice));
        picture.setTextContent(drinkPicture);
        
        //add the child nodes to the plate node
        cup.appendChild(name);
        cup.appendChild(description);
        cup.appendChild(quantity);
        cup.appendChild(price);
        cup.appendChild(picture);
        
        //add plate node to the root node
        root.appendChild(cup);
        
        try {
            write();//Write the values to the xml file
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(DrinksDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(DrinksDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //Remove the drink from xml file
    //Pre: Name of drink
    //Post: delete the element from file
    public void removeDrinkByName(String name){
        //Get root element
        Element root = doc.getDocumentElement();
        
        //Put children of root element with name plate into nodelist
        NodeList children = root.getElementsByTagName("cup");
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
            Logger.getLogger(DrinksDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(DrinksDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Updates the xml file
    private void write() throws TransformerConfigurationException, TransformerException{
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            //initialize StreamResult with File object to save to file
            StreamResult result = new StreamResult(new FileWriter("src/Database/Drinks.xml"));
            DOMSource source = new DOMSource(doc);
            transformer.transform(source, result);
        } catch (IOException ex) {
            Logger.getLogger(DrinksDao.class.getName()).log(Level.SEVERE, null, ex);
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
    
    //adds the drink elements to drink object
    private Drink getDrink(Element drinkElement){
        String name = getTextValue(drinkElement,"name");
	String Description = getTextValue(drinkElement,"description");
        int quantity = Integer.parseInt(getTextValue(drinkElement, "quantity"));
	Double price = Double.parseDouble(getTextValue(drinkElement, "price"));
        String picture = getTextValue(drinkElement,"picture");

	Drink appetizer = new Drink(name,"Drinks",Description,price,quantity,picture);

	return appetizer;
    }
}
