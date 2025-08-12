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
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("--------%s%n--------%s%n", v, w));
    for (B elem : bList) {
        sb.append(elem + "\n");
    }
    return sb.toString();
}


