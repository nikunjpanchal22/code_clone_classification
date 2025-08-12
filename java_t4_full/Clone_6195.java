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
    List<String> list = new ArrayList<>();
    list.add(a.toString());
    list.add(b.toString());
    list.addAll(aList.stream().map(Object::toString).collect(Collectors.toList()));
    return String.join("\n", list);
}


