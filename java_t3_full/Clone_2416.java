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
    try {
        SOAPMessage msg = context.getMessage();
        if(msg != null) msg.writeTo(System.out);
    } catch(Exception ex) {
        Logger.getLogger(LogMessageHandler.class.getName()).log(Level.SEVERE, null, ex);
    }
    return true;
}


