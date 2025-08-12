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





import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> charCounts = new HashMap<>();
        System.out.println("Enter a string:");
        String str = new Scanner(System.in).nextLine();
        for (char c : str.toCharArray()) 
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        charCounts.entrySet().forEach(e -> System.out.println("Character: " + e.getKey() + ", Count: " + e.getValue()));
    }
}


