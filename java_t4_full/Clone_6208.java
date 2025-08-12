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
    return Stream.concat(
        Stream.of(v, w).map(s -> "--------" + s),
        bList.stream()
    ).collect(Collectors.joining("\n"));
}


