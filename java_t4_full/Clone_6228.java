public static void countString (String str) {
    if (str != null) {
        int length = str.length ();
        char ch [] = str.toCharArray ();
        Arrays.sort (ch);
        if (length > 0) {
            char x = ch [0];
            int count = 1;
            for (int i = 1;
            i < length; i ++) {
                if (ch [i] == x) {
                    count ++;
                } else {
                    System.out.println ("Number of Occurrence of '" + ch [i - 1] + "' is: " + count);
                    x = ch [i];
                    count = 1;
                }
            }
            System.out.println ("Number of Occurrence of '" + ch [length - 1] + "' is: " + count);
        }
    }
}





public static void countString(String str){
    str.chars().mapToObj(i -> (char)i)
    .collect(Collectors.toMap(Function.identity(), i -> 1, Integer::sum))
    .forEach((k, v) -> System.out.println("Number of Occurrence of '" + k + "' is: " + v));
}


