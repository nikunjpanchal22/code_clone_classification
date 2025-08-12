public static void main (String [] args) throws FileNotFoundException, XMLStreamException {
    System.setProperty ("javax.xml.stream.XMLInputFactory", "com.ctc.wstx.stax.WstxInputFactory");
    System.setProperty ("javax.xml.stream.XMLOutputFactory", "com.ctc.wstx.stax.WstxOutputFactory");
    System.setProperty ("javax.xml.stream.XMLEventFactory", "com.ctc.wstx.stax.WstxEventFactory");
    FileInputStream fis = new FileInputStream (new File ("family.xml"));
    XMLInputFactory xmlif = XMLInputFactory.newFactory ();
    XMLStreamReader2 xmlsr = (XMLStreamReader2) xmlif.createXMLStreamReader (fis);
    String currentElementName = null;
    while (xmlsr.hasNext ()) {
        int eventType = xmlsr.next ();
        switch (eventType) {
            case (XMLEvent2.START_ELEMENT) :
                currentElementName = xmlsr.getName ().toString ();
                if ("dad".equals (currentElementName) == true) {
                    System.out.println ("isStartElement: " + xmlsr.isStartElement ());
                    System.out.println ("Element BEGIN: " + currentElementName);
                    xmlsr.skipElement ();
                } else {
                    System.out.println (currentElementName);
                }
        }
    }
}


public static void main (String [] args) 
        throws FileNotFoundException, XMLStreamException {
    System.setProperty ("javax.xml.stream.XMLInputFactory", 
            "com.ctc.wstx.stax.WstxInputFactory");
    System.setProperty ("javax.xml.stream.XMLOutputFactory", 
            "com.ctc.wstx.stax.WstxOutputFactory");
    System.setProperty ("javax.xml.stream.XMLEventFactory", 
            "com.ctc.wstx.stax.WstxEventFactory");
    FileInputStream fileInputStreamObject = new FileInputStream (
            new File ("family.xml"));
    XMLInputFactory xmlInputFactoryObject = 
            XMLInputFactory.newFactory ();
    XMLStreamReader2 xmlStreamReaderObject = 
            (XMLStreamReader2) xmlInputFactoryObject.createXMLStreamReader 
            (fileInputStreamObject);
    String currentElementName = null;
    while (xmlStreamReaderObject.hasNext ()) {
        int eventType = xmlStreamReaderObject.next ();
        switch (eventType) {
            case (XMLEvent2.START_ELEMENT) :
                currentElementName = 
                        xmlStreamReaderObject.getName ().toString ();
                if ("dad".equals (currentElementName) == true) {
                    System.out.println ("isStartElement: " 
                            + xmlStreamReaderObject.isStartElement ());
                    System.out.println ("Element BEGIN: " 
                            + currentElementName);
                    xmlStreamReaderObject.skipElement ();
                } else {
                    System.out.println (currentElementName);
                }
        }
    }
}
