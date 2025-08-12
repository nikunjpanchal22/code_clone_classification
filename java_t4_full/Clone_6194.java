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
    StringJoiner sj = new StringJoiner("\n");
    sj.add(a.toString());
    sj.add(b.toString());
    aList.forEach(elem -> sj.add(elem.toString()));
    return sj.toString();
}


