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
    String read = inputGenerator.getMessage();
    StringBuilder msg = new StringBuilder();
    boolean start = read.toLowerCase().startsWith("hi");
    while (start) {
        msg.append(read);
        read = inputGenerator.getMessage();
        start = read.toLowerCase().startsWith("hi");
    }
    return msg.toString();
}


