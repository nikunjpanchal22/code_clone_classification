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
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8")));
        out.println(context.getMessage().toString());
        out.flush();
    } catch(Exception ex) {
        Logger.getLogger(LogMessageHandler.class.getName()).log(Level.SEVERE, null, ex);
    }
    return true;
}


