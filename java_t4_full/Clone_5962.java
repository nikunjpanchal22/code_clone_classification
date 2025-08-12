public static String removeAdjacentDuplicates (String input) {
    if (input.length () <= 1) {
        return input;
    }
    StringBuilder sb = new StringBuilder ();
    sb.append (input.charAt (0));
    IntStream.range (1, input.length ()).mapToObj (i -> input.charAt (i) != input.charAt (i - 1) ? input.charAt (i) : "").forEach (sb :: append);
    return sb.toString ();
}





public static String removeAdjacentDuplicates(String input){
    List<Character> list = new ArrayList<>();
    for(char c : input.toCharArray()){
        if(list.isEmpty() || list.get(list.size() - 1) != c)
            list.add(c);
    }
    StringBuilder sb = new StringBuilder();
    for(char c : list)
        sb.append(c);
    return sb.toString();
}


