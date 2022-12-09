package Common;

import java.io.File;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlFileReader {

	public static void main(String[] args) {
		
			try {
				File xmlFile = new File("C:/Users/welcome/eclipse-workspace-selenium/selenium-automation/src/main/resources/Text.xml");
				
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newDefaultInstance();
				
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				
				Document doc = (Document) dBuilder.parse(xmlFile);
			    
				doc.getDocumentElement().normalize();
			    
				System.out.println("Root element ;" + doc.getDocumentElement().getNodeName());
				
				NodeList nList = doc.getElementsByTagName("functional_testing");
				
				System.out.println("---------------------");
				
				for (int temp = 0; temp <nList.getLength(); temp++) {
					Node nNode = nList.item(temp);
					System.out.println("\nCurrent Element :" +nNode.getNodeName());
					
					if (nNode.getNodeType()==Node.ELEMENT_NODE) {
						Element eElement = (Element) nNode;
						System.out.println("test_type:" +eElement.getElementsByTagName("test_type").item(temp).getTextContent());
						System.out.println("test_type:" +eElement.getElementsByTagName("test_type").item(temp).getTextContent());
					}
					
				}
		
			}
			
	}
		
			
}		
	


