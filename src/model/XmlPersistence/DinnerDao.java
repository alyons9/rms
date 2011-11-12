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
 * @Class Name: DinnerDao
 * @author anthonylyons
 */
public class DinnerDao {
    
    private NodeList nl;
    private Document doc;
    private boolean done;
    
    public DinnerDao()throws SAXException, ParserConfigurationException{
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder db = dbf.newDocumentBuilder();
            
            doc = db.parse("src/Database/Dinner.xml");
            
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
    
    public Food getDinnerByName(String name){
        Food dinner = new Food();
        if(nl != null && nl.getLength() > 0) {
            for(int i = 0 ; i < nl.getLength();i++) {
                //get the employee element
                Element el = (Element)nl.item(i);
                if(getTextValue(el,"name").equals(name)){
                    //get the Employee object
                    dinner = getDinner(el);
                }

				
            }
            
	}
        
        return dinner;
    }
    
       public Food[] getAllDinners(){
       int numOfElem = nl.getLength();
        Food dinners[] = new Food[numOfElem];
        if(nl != null && numOfElem > 0) {
            for(int i = 0 ; i < numOfElem;i++) {
                //get the appetizer element
                Element el = (Element)nl.item(i);
                
                    //get the appetizer object
                    dinners[i] = getDinner(el);
                

				
            }
            
	}
        
        return dinners;
    }
       
        public Vector<Food> getVectorAllDinners(){
       int numOfElem = nl.getLength();
        Vector <Food> appetizers = new Vector(numOfElem);
        if(nl != null && numOfElem > 0) {
            for(int i = 0 ; i < numOfElem;i++) {
                //get the appetizer element
                Element el = (Element)nl.item(i);
                
                    //get the appetizer object
                    appetizers.add(i,getDinner(el));
                

				
            }
            
	}
        
        return appetizers;
    }
       
       
       
        //returns the lenght of nodes
    public int length(){
        int temp = nl.getLength();
        return temp;
    }
       
    
    public void addDinner(String dinnerName, String dinnerDescription,int dinnerQuantity,double dinnerPrice,String dinnerPicture){
        Node root = doc.getDocumentElement();
        Node plate = doc.createElement("plate");
        Node name = doc.createElement("name");
        Node description = doc.createElement("description");
        Node quantity = doc.createElement("quantity");
        Node price = doc.createElement("price");
        Node picture = doc.createElement("picture");
        
        name.setTextContent(dinnerName);
        description.setTextContent(dinnerDescription);
        quantity.setTextContent(Integer.toString(dinnerQuantity));
        price.setTextContent(Double.toString(dinnerPrice));
        picture.setTextContent(dinnerPicture);
        
        plate.appendChild(name);
        plate.appendChild(description);
        plate.appendChild(quantity);
        plate.appendChild(price);
        plate.appendChild(picture);
        
        root.appendChild(plate);
        try {
            write();
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(DinnerDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(DinnerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean removeDinnerByName(String name){
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
    
    private void write() throws TransformerConfigurationException, TransformerException{
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            //initialize StreamResult with File object to save to file
            StreamResult result = new StreamResult(new FileWriter("src/Database/Dinner.xml"));
            DOMSource source = new DOMSource(doc);
            transformer.transform(source, result);
        } catch (IOException ex) {
            Logger.getLogger(DinnerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nodel = ele.getElementsByTagName(tagName);
		if(nodel != null && nodel.getLength() > 0) {
			Element el = (Element)nodel.item(0);
                        if(el.hasChildNodes()){
			textVal = el.getFirstChild().getNodeValue();
                        }else{
                            textVal = " ";
                        }
		}

		return textVal;
	}
    
    private Food getDinner(Element dinnerElement){
        String name = getTextValue(dinnerElement,"name");
	String Description = getTextValue(dinnerElement,"description");
        int quantity = Integer.parseInt(getTextValue(dinnerElement, "quantity"));
	Double price = Double.parseDouble(getTextValue(dinnerElement, "price"));
        String picture = getTextValue(dinnerElement,"picture");

	Food dinner = new Food(name,"Dinner",Description,price,quantity,picture);

	return dinner;
    }
    
    
}
