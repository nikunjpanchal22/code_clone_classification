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
    return input.chars()
            .mapToObj(i -> (char)i)
            .filter(c -> list.indexOf(c) == -1)
            .map(String::valueOf)
            .collect(Collectors.joining());
}


