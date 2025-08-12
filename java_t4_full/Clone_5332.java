private void parseComments (InputStream in, Workbook workbook) {
    try {
        DefaultHandler handler = getCommentHandler (workbook);
        SAXParser saxParser = getSAXParser ();
        saxParser.parse (in, handler);
    } catch (Exception e) {
        e.printStackTrace ();
    }
}



private void parseComments(InputStream in, Workbook workbook) throws ParserConfigurationException, SAXException, IOException {
    CommentHandler handler = getCommentHandler(workbook);
    SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
    saxParser.parse(in, handler);
}


