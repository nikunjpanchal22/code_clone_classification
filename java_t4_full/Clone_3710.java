public static void main (String...a) {
    System.out.print ("Enter the String");
    Scanner sc = new Scanner (System.in);
    String st = sc.nextLine ();
    int [] ar = new int [256];
    for (int i = 0;
    i < st.length (); i ++) {
        ar [st.charAt (i)] = ar [st.charAt (i)] + 1;
    }
    for (int i = 0;
    i < 256; i ++) {
        char ch = (char) i;
        if (ar [i] > 0) {
            if (ar [i] == 1) {
                System.out.print (ch);
            } else {
                System.out.print (ch + "" + ar [i]);
            }
        }
    }
}




public static void main (String...args) {
    System.out.print("Enter the String: ");
    String st = new java.util.Scanner(System.in).nextLine();
    java.util.Map<Character, Integer> freqMap = st.chars().boxed()
        .collect(java.util.stream.Collectors.groupingBy(k -> Character.valueOf((char) k.intValue()), java.util.stream.Collectors.summingInt(e -> 1)));
    freqMap.entrySet().stream().forEach(e -> System.out.print(e.getKey()));
}


