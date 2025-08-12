public String toString () {
    StringBuilder sb = new StringBuilder ();
    sb.append ("--------" + v + "\n");
    sb.append ("--------" + w + "\n");
    for (B elem : bList) {
        sb.append (elem + "\n");
    }
    return sb.toString ();
}


 public String toString() {
    String outputString = String.format("--------%s%n--------%s%n", v, w);
    for (int i = 0; i < bList.size(); i++) {
        outputString += bList.get(i) + "\n";
    }
    return outputString;
}


