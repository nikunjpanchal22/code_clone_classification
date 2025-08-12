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
    sb.append ("Object holds a = " + a + " and b = " + b + "\n");
    for (A elem : aList) {
        sb.append (elem.toString() + "\n");
    }
    return sb.toString ();
}


