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
public class AppetizersDao {
    private NodeList nl;
    private Document doc;
    public AppetizersDao() throws SAXException, ParserConfigurationException{
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder db = dbf.newDocumentBuilder();
            
            doc = db.parse("src/Database/Appetizers.xml");
            
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
    
    public Food getAppetizerByName(String name){
        Food appetizer = new Food();
        if(nl != null && nl.getLength() > 0) {
            for(int i = 0 ; i < nl.getLength();i++) {
                //get the employee element
                Element el = (Element)nl.item(i);
                if(getTextValue(el,"name").equals(name)){
                    //get the Employee object
                    appetizer = getAppetizer(el);
                }

				
            }
            
	}
        
        return appetizer;
    }
    
    public void addAppetizer(String appetizerName, String appetizerDescription,int appetizerQuantity,double appetizerPrice,String appetizerPicture){
        Node root = doc.getDocumentElement();
        Node plate = doc.createElement("plate");
        Node name = doc.createElement("name");
        Node description = doc.createElement("description");
        Node quantity = doc.createElement("quantity");
        Node price = doc.createElement("price");
        Node picture = doc.createElement("picture");
        
        name.setTextContent(appetizerName);
        description.setTextContent(appetizerDescription);
        quantity.setTextContent(Integer.toString(appetizerQuantity));
        price.setTextContent(Double.toString(appetizerPrice));
        picture.setTextContent(appetizerPicture);
        
        plate.appendChild(name);
        plate.appendChild(description);
        plate.appendChild(quantity);
        plate.appendChild(price);
        plate.appendChild(picture);
        
        root.appendChild(plate);
        try {
            write();
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(AppetizersDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(AppetizersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void removeAppetizerByName(String name){
        Element root = doc.getDocumentElement();
        
        NodeList children = root.getElementsByTagName("plate");
        for(int i=0; i<children.getLength(); i++){
            Element child = (Element)children.item(i);
            
            if(getTextValue(child,"name").equals(name)){
                    root.removeChild(child);
                }
            
        }
        try {
            write();
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(AppetizersDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(AppetizersDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
    
    private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nodel = ele.getElementsByTagName(tagName);
		if(nodel != null && nodel.getLength() > 0) {
			Element el = (Element)nodel.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}
    
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
