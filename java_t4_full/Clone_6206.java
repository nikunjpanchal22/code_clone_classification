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
    return "--------" + v + "\n" + "--------" + w + "\n" + String.join("\n", bList);
}


