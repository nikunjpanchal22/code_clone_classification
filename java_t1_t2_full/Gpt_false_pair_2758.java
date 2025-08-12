public String getString () {
    StringBuilder msg = new StringBuilder ();
    String read;
    do {
        read = inputGenerator.getMessage ();
        msg.append (read);
    } while (read.toLowerCase ().startsWith ("hi"));
    return msg.toString ();
}


 public String getString() {
    StringBuilder msg = new StringBuilder();
    String read;
    do {
        read = inputGenerator.getMessage();
        if(read.toLowerCase().startsWith("hi")) {
            msg.append(" - ");
            msg.append(read);
        }
    } while (read.toLowerCase().startsWith("hi"));
    return msg.toString();
}
