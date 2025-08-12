public boolean handleMessage (SOAPMessageContext context) {
    SOAPMessage msg = context.getMessage ();
    try {
        msg.writeTo (System.out);
    } catch (Exception ex) {
        Logger.getLogger (LogMessageHandler.class.getName ()).log (Level.SEVERE, null, ex);
    }
    return true;
}


 public boolean handleMessage (SOAPMessageContext context) {	try {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        msg.writeTo (baos);
        String content = baos.toString();
        System.out.print(content);
    } catch (Exception ex) {
        Logger.getLogger (LogMessageHandler.class.getName ()).log (Level.SEVERE, null, ex);
    }
}


