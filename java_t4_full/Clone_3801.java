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


 

public static void main(String[] args) {
    System.out.println("Enter your input: ");
    String inValue = new java.util.Scanner(System.in).nextLine();
    java.util.Map<Character, Integer> map = new java.util.LinkedHashMap<Character, Integer>();
    for (char c : inValue.toCharArray()) {
        map.put(c, (map.containsKey(c))? map.get(c)+1:1);
    }
    for (char c : map.keySet()) {
        System.out.println(c + ":" + map.get(c));
    }
}


