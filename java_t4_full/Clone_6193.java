public String toString () {
    StringBuilder sb = new StringBuilder ();
    sb.append (a + "\n");
    sb.append (b + "\n");
    for (A elem : aList) {
        sb.append (elem + "\n");
    }
    return sb.toString ();
}





public String toString () {
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    pw.println(a);
    pw.println(b);
    aList.forEach(pw::println);
    return sw.toString();
}


