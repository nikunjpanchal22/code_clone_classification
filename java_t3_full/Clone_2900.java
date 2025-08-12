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
        SAXParser saxParser = getSAXParser();
        CommentHandler handler = getCommentHandler(workbook);
        saxParser.parse(in, handler);
    } catch (Exception e) {
        Logger.getGlobal().log(Level.SEVERE, "Error parsing comments", e);
    }
}


