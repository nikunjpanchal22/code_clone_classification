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
    List<String> stringsList = new ArrayList<>();
    stringsList.add("--------" + v);
    stringsList.add("--------" + w);
    stringsList.addAll(bList.stream().map(Object::toString).collect(Collectors.toList()));
    return String.join("\n", stringsList);
}


