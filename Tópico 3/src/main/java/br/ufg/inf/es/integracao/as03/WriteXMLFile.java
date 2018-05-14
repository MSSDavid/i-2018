package br.ufg.inf.es.integracao.as03;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteXMLFile {

	public static void main(String args[]) {

	  try {

		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root elements
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("alunos");
		doc.appendChild(rootElement);

		// staff elements
		Element staff = doc.createElement("aluno");
		rootElement.appendChild(staff);

		// shorten way
		// staff.setAttribute("id", "1");

		// nome elements
		Element nome = doc.createElement("nome");
		nome.appendChild(doc.createTextNode(args[0]));
		staff.appendChild(nome);

		// email elements
		Element email = doc.createElement("email");
		email.appendChild(doc.createTextNode(args[1]));
		staff.appendChild(email);


		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
                
                
		StreamResult result = new StreamResult(new File("file.xml"));
                StreamResult result2 = new StreamResult(System.out);

		// Output to console for testin
		// StreamResult result = new StreamResult(System.out);
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC,"yes");
                transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

		transformer.transform(source, result);
                transformer.transform(source, result2);

	  } catch (ParserConfigurationException | TransformerException pce) {
	  }
	}
}
