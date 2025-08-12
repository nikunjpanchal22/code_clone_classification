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
    StringBuilder sb = new StringBuilder ();
    sb.append("Attributes a and b are: ");
    sb.append ("a:" + a + "\t");
    sb.append ("b:" + b + "\n");
    for (A elem : aList) {
        sb.append (elem.toString() + "\n");
    }
    return sb.toString ();
}


