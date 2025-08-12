private void parseComments (InputStream in, Workbook workbook) {
    try {
        DefaultHandler handler = getCommentHandler (workbook);
        SAXParser saxParser = getSAXParser ();
        saxParser.parse (in, handler);
    } catch (Exception e) {
        e.printStackTrace ();
    }
}



private void parseComments(InputStream in, Workbook workbook) throws IOException, SAXException, ParserConfigurationException {
    SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
    CommentHandler handler = getCommentHandler(workbook);
    parser.parse(in, handler);
}


