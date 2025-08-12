public static String myTrim (String input, String list) {
    String r = "";
    for (int i = 0;
    i < input.length (); i ++) {
        int k = 0;
        for (; k < list.length (); k ++) {
            if (input.charAt (i) == list.charAt (k)) {
                break;
            }
        }
        if (k == list.length ()) r += input.charAt (i);
    }
    return r;
}



 

public static String myTrim (String input, String list) {
   return IntStream.range(0, input.length())
            .mapToObj(i -> input.charAt(i))
            .filter(c -> list.indexOf(c) < 0)
            .map(String::valueOf)
            .collect(Collectors.joining());
}


