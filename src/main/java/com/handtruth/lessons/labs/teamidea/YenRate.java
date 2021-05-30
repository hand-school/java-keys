package com.handtruth.lessons.labs.teamidea;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class YenRate {
    public static void main(String[] args) {
        File xmlFile = new File("C:\\Users\\ReDus\\Desktop\\XML_daily.asp");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName("Valute");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node fstNode = nodeList.item(i);
                if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element fstElmnt = (Element) fstNode;
                    NodeList ChCElmntLst = fstElmnt.getElementsByTagName("CharCode");
                    Element ChCElmnt = (Element) ChCElmntLst.item(0);
                    NodeList ChCNm = ChCElmnt.getChildNodes();
                    if (ChCNm.item(0).getNodeValue().equals("JPY")) {
                        NodeList ValElmntLst = fstElmnt.getElementsByTagName("Value");
                        Element ValElmnt = (Element) ValElmntLst.item(0);
                        NodeList ValNm = ValElmnt.getChildNodes();
                        String value = ((Node) ValNm.item(0)).getNodeValue().replace(',', '.');
                        double value1 = Double.parseDouble(value) / 100;
                        System.out.println("1 YEN = " + value1 + " RUB");
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
