package bsu.training.xslt;

import java.io.File;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Transform {
	
 public static void main(String[ ] args) throws Exception {
  final String flScript = "catalog.xsl";
  final String flData = "catalog.xml";
  
  //������� ������� ���� � ������� ������
  final File xmlFile = new File(flData); 
  final File xsltFile = new File(flScript);
  
  //������ ������ � JAXP ����� Source 
  final Source xmlSource = new StreamSource(xmlFile); 
  final Source xsltSource = new StreamSource(xsltFile);
  
  //������� ��������� XSLT 
  final TransformerFactory transFact = TransformerFactory.newInstance(); 
  final Transformer trans = transFact.newTransformer(xsltSource);
  
  // ��������� ������� ������ � �������� ��������� 
  trans.transform(xmlSource, new StreamResult(System.out));
 }
}