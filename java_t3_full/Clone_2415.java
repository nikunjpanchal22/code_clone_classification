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
        new OutputStreamWriter(System.out, "UTF-8").write(msg.toString());
    } catch(Exception ex) {
        Logger.getLogger(LogMessageHandler.class.getName()).severe(ex.getMessage());
    }
    return true;
}


