private void parseComments (InputStream in, Workbook workbook) {
    try {
        DefaultHandler handler = getCommentHandler (workbook);
        SAXParser saxParser = getSAXParser ();
        saxParser.parse (in, handler);
    } catch (Exception e) {
        e.printStackTrace ();
    }
}


private void parseComments(InputStream in, Workbook workbook) {
    try {
        CommentsHandler handler = getCommentHandler(workbook);
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        saxParser.parse(in, handler);
    } catch (ParserConfigurationException | SAXException | IOException e) {
        e.printStackTrace();
    }
}


