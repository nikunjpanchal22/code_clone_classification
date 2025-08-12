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
    sb.append (a + ";");
    sb.append (b + ";");
    for (int i=0; i < aList.length; i++) {
        sb.append (aList[i] + ";");
    }
    return sb.toString ();
}


