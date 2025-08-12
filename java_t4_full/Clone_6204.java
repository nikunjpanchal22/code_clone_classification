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
    List<Object> objectsList = new ArrayList<>();
    objectsList.addAll(Arrays.asList("--------" + v, "--------" + w));
    objectsList.addAll(bList);
    return objectsList.stream().map(Object::toString).collect(Collectors.joining("\n"));
}


