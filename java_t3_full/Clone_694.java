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
        HashMap<Character, Integer> hm = new HashMap<>();
        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
 
        for (int i = 0; i < s1.length(); i++) {
            if (hm.containsKey(s1.charAt(i))) {
                int count = hm.get(s1.charAt(i));
                count++;
                hm.put(s1.charAt(i), count);
            } else {
                hm.put(s1.charAt(i), 1);
            }
        }
        System.out.println("The Characters are:" + hm);
}


