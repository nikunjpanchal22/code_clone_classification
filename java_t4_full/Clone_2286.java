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
    String read = inputGenerator.getMessage();
    while (read.toLowerCase().startsWith("hi")) {
        msg.append(" - " + read);
        read = inputGenerator.getMessage();
    }
    return msg.toString();
}


