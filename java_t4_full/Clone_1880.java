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
    StringBuilder sb = new StringBuilder("--------" + v + "\n" + "--------" + w + "\n");
    for (int i = 0; i < bList.size(); i++) {
        sb.append(bList.get(i) + "\n");
    }
    return sb.toString();
}


