package com;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DEMO
{
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        File file = new File("book.xml");
        Document document = documentBuilder.parse(file);
        NodeList bookElements = document.getElementsByTagName("书名");
        int length = bookElements.getLength();
        System.out.println(length);
        Element bookitem = (Element)bookElements.item(0);
        short nodeType = bookitem.getNodeType();
        System.out.println(nodeType);
        System.out.println(bookitem.getNodeName());
        System.out.println(bookitem.getNodeValue());
    }
}