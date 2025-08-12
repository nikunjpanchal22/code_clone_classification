public boolean handleMessage (SOAPMessageContext context) {
    SOAPMessage msg = context.getMessage ();
    try {
        msg.writeTo (System.out);
    } catch (Exception ex) {
        Logger.getLogger (LogMessageHandler.class.getName ()).log (Level.SEVERE, null, ex);
    }
    return true;
}





public boolean handleMessage(SOAPMessageContext context) {
    SOAPMessage msg = context.getMessage();
    try {
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt"), "UTF-8"));
        out.write(msg.toString());
        out.flush();
    } catch(Exception ex) {
        Logger.getLogger(LogMessageHandler.class.getName()).log(Level.SEVERE, null, ex);
    }
    return true;
}


