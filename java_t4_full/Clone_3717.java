public static void main (String [] args) {
    HashMap < Character, Integer > hm = new HashMap < Character, Integer > ();
    System.out.println ("Enter an String:");
    Scanner sc = new Scanner (System.in);
    String s1 = sc.nextLine ();
    for (int i = 0;
    i < s1.length (); i ++) {
        if (! hm.containsKey (s1.charAt (i))) {
            hm.put (s1.charAt (i), (Integer) 1);
        } else {
            hm.put (s1.charAt (i), hm.get (s1.charAt (i)) + 1);
        }
    }
    System.out.println ("The Charecters are:" + hm);
}






public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String stringInput = sc.nextLine();
    IntStream.range(0, stringInput.length()).boxed().collect(Collectors.toMap(i -> stringInput.charAt(i), i -> 1, Integer::sum)).entrySet().forEach(System.out::println);
}


