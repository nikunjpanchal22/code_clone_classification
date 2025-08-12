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
        OutputStream os = new ByteArrayOutputStream();
        msg.writeTo(os);
        InputStream is = new ByteArrayInputStream(((ByteArrayOutputStream) os).toByteArray());
        System.out.print(is); 
    } catch (Exception ex) {
        Logger.getLogger (LogMessageHandler.class.getName ()).log (Level.SEVERE, null, ex);
    }
}


