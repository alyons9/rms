/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.XmlPersistence;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import model.Food;
import org.xml.sax.SAXException;

/**
 *
 * @author anthonylyons
 */
public class AppetizersDao {
    private NodeList nl;
    public AppetizersDao() throws SAXException, ParserConfigurationException{
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder db = dbf.newDocumentBuilder();
            
            Document doc = db.parse("src/Database/Appetizers.xml");
            
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

		appetizer = getAppetizer(el);		
            }
            
	}
        
        return appetizer;
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
