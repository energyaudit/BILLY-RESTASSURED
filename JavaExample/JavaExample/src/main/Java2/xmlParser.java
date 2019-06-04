package src.main.Java2;

/**
 * Created by byang on 2018-06-14.
 */

import java.io.File;
        import javax.xml.parsers.DocumentBuilder;
        import javax.xml.parsers.DocumentBuilderFactory;
        import org.w3c.dom.Document;
        import org.w3c.dom.Element;
        import org.w3c.dom.Node;
        import org.w3c.dom.NodeList;

/**
 * This class is used to parse XML document using DOM parser.
 * @author codesjava
 */
public class xmlParser {
    public static void main(String args[]){
        try {
            //File Path
            String filePath = "C:\\QA\\TEST\\Data\\StudentTest.xml";

            //Read XML file.
            File inputFile = new File(filePath);

            //Create DocumentBuilderFactory object.
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();

            //Get DocumentBuilder object.
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            //Parse XML file.
            Document document = dBuilder.parse(inputFile);
            document.getDocumentElement().normalize();

            //Print root element.
            System.out.println("Root element:"
                    + document.getDocumentElement().getNodeName());

            //Get element list.
            NodeList nodeList =
                    document.getElementsByTagName("student");

            System.out.println("Elements count: " + nodeList.getLength());//Count Xml File Elements In Java


            //Process element list.
            for (int temp = 0; temp < nodeList.getLength(); temp++) {
                Node nNode = nodeList.item(temp);
                System.out.println("\nCurrent Element:"
                        + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Roll no: "
                            + eElement.getAttribute("rollno"));

                    System.out.println("First Name: "
                            + eElement.getElementsByTagName("firstname")
                            .item(0).getTextContent());

                    System.out.println("Last Name: "
                            + eElement.getElementsByTagName("lastname")
                            .item(0).getTextContent());

                    System.out.println("Marks: "
                            + eElement.getElementsByTagName("marks")
                            .item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
