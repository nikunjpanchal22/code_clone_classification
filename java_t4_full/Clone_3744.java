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



 

public static void main (String...params) {
    System.out.print ("Enter the String");
    java.util.Scanner scan = new java.util.Scanner (System.in);
    String inp = scan.nextLine ();
    int [] freq = new int [256];
    inp.chars().forEach(c -> freq[c]++);
    java.util.stream.IntStream.range(0,256).filter(x -> freq[x] > 0).mapToObj(x -> (char)x + (freq[x] > 1 ? String.valueOf(freq[x]) : "")).forEach(System.out::print);
}


