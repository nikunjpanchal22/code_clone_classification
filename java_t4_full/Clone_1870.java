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
    String[] strArray = new String[aList.length + 2];
    strArray[0] = a;
    strArray[1] = b;
    for (int i = 0; i < aList.length; i++) {
        strArray[i + 2] = aList[i];
    }
    return String.join("\n", strArray);
}


