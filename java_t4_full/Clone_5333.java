private void parseComments (InputStream in, Workbook workbook) {
    try {
        DefaultHandler handler = getCommentHandler (workbook);
        SAXParser saxParser = getSAXParser ();
        saxParser.parse (in, handler);
    } catch (Exception e) {
        e.printStackTrace ();
    }
}



private void parseComments(InputStream in, Workbook workbook) throws SAXException, ParserConfigurationException, IOException {
    DefaultHandler handler = getCommentHandler(workbook);
    SAXParser saxParser = getSAXParser();
    sxParser.parse(new InputSource(in), handler);
}


