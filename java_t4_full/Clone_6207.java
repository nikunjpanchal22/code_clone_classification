public String toString () {
    StringBuilder sb = new StringBuilder ();
    sb.append ("--------" + v + "\n");
    sb.append ("--------" + w + "\n");
    for (B elem : bList) {
        sb.append (elem + "\n");
    }
    return sb.toString ();
}





public String toString () {
    return String.join("\n", 
        "--------" + v, 
        "--------" + w,
        bList.stream().map(Object::toString).collect(Collectors.toList())
    );
}


