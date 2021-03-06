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
 * @Class Name: BreakfastDao
 * @author anthonylyons
 */
public class BreakfastDao {
    
    private NodeList nl;
    private Document doc;
    private boolean done;
    
    public BreakfastDao()throws SAXException, ParserConfigurationException{
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder db = dbf.newDocumentBuilder();
            
            doc = db.parse("src/Database/Breakfast.xml");
            
            Element docEle = doc.getDocumentElement();
            nl = docEle.getElementsByTagName("plate");
            
        } catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
    
        
    }
    
    public Food getBreakfastByName(String name){
        Food Breakfast = new Food();
        if(nl != null && nl.getLength() > 0) {
            for(int i = 0 ; i < nl.getLength();i++) {
                //get the employee element
                Element el = (Element)nl.item(i);
                if(getTextValue(el,"name").equals(name)){
                    //get the Employee object
                    Breakfast = getBreakfast(el);
                }

				
            }
            
	}
        
        return Breakfast;
    }
    
    public Food[] getAllBreakfasts(){
       int numOfElem = nl.getLength();
        Food breakfasts[] = new Food[numOfElem];
        if(nl != null && numOfElem > 0) {
            for(int i = 0 ; i < numOfElem;i++) {
                //get the appetizer element
                Element el = (Element)nl.item(i);
                
                    //get the appetizer object
                    breakfasts[i] = getBreakfast(el);
                

				
            }
            
	}
        
        return breakfasts;
    }
    
       public Vector<Food> getVectorAllBreakfasts(){
       int numOfElem = nl.getLength();
        Vector <Food> breakfasts = new Vector(numOfElem);
        if(nl != null && numOfElem > 0) {
            for(int i = 0 ; i < numOfElem;i++) {
                //get the appetizer element
                Element el = (Element)nl.item(i);
                
                    //get the appetizer object
                    breakfasts.add(i,getBreakfast(el));
                

				
            }
            
	}
        
        return breakfasts;
    }
    
    
     //returns the lenght of nodes
    public int length(){
        int temp = nl.getLength();
        return temp;
    }
    
    public void addBreakfast(String breakfastName, String breakfastDescription,int breakfastQuantity,double breakfastPrice,String breakfastPicture){
        Node root = doc.getDocumentElement();
        Node plate = doc.createElement("plate");
        Node name = doc.createElement("name");
        Node description = doc.createElement("description");
        Node quantity = doc.createElement("quantity");
        Node price = doc.createElement("price");
        Node picture = doc.createElement("picture");
        
        name.setTextContent(breakfastName);
        description.setTextContent(breakfastDescription);
        quantity.setTextContent(Integer.toString(breakfastQuantity));
        price.setTextContent(Double.toString(breakfastPrice));
        picture.setTextContent(breakfastPicture);
        
        plate.appendChild(name);
        plate.appendChild(description);
        plate.appendChild(quantity);
        plate.appendChild(price);
        plate.appendChild(picture);
        
        root.appendChild(plate);
        try {
            write();
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(BreakfastDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(BreakfastDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean removeBreakfastByName(String name){
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
            Logger.getLogger(BreakfastDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(BreakfastDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return done;
    }
    
     private void setTextValue(Element ele, String tagName, String newValue){
        NodeList nodeList = ele.getElementsByTagName(tagName);
        if(nodeList!=null && nodeList.getLength()>0){
            Element el = (Element)nodeList.item(0);
            el.getFirstChild().setNodeValue(newValue);
        }
                
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
                    Logger.getLogger(BreakfastDao.class.getName()).log(Level.SEVERE, null, ex);
                } catch (TransformerException ex) {
                    Logger.getLogger(BreakfastDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return done;
        
    }
    
    
    private void write() throws TransformerConfigurationException, TransformerException{
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            //initialize StreamResult with File object to save to file
            StreamResult result = new StreamResult(new FileWriter("src/Database/Breakfast.xml"));
            DOMSource source = new DOMSource(doc);
            transformer.transform(source, result);
        } catch (IOException ex) {
            Logger.getLogger(BreakfastDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nodel = ele.getElementsByTagName(tagName);
		if(nodel != null && nodel.getLength() > 0) {
			Element el = (Element)nodel.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}
    
    private Food getBreakfast(Element breakfastElement){
        String name = getTextValue(breakfastElement,"name");
	String Description = getTextValue(breakfastElement,"description");
        int quantity = Integer.parseInt(getTextValue(breakfastElement, "quantity"));
	Double price = Double.parseDouble(getTextValue(breakfastElement, "price"));
        String picture = getTextValue(breakfastElement,"picture");

	Food breakfast = new Food(name,"Breakfast",Description,price,quantity,picture);

	return breakfast;
    }
    
}
