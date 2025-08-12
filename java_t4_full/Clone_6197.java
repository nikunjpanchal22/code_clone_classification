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
    return String.format("%s\n%s\n%s", a, b, String.join("\n", aList));
}


