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
    List<String> lstString = new ArrayList<>();
    lstString.add("Attributes are a = " + a + " and b = " + b);
    for (A elem : aList) {
        lstString.add(elem.toString());
    }
    return String.join("\n", lstString);
}


