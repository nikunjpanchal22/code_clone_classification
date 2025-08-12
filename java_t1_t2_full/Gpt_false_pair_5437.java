public void characters (char ch [], int start, int length) throws SAXException {
    tmpElementValue = new String (
        ch, 
        start, 
        length
    );
}


public void characters (char characterArray [], int strt, int len) throws SAXException {
    tmpElementValue = new String (
        characterArray, 
        strt, 
        len
    );
}
