public void characters (char ch [], int start, int length) throws SAXException {
    tmpElementValue = new String (
        ch, 
        start, 
        length
    );
}


public void characters (char ch [], int s, int l) throws SAXException {
    tmpElementValue = new String (
        ch, 
        s, 
        l
    );
}
