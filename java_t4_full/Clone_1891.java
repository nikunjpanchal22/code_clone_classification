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


 
public static void countString (String str) {
    if (str != null) {
        int length = str.length ();
        char ch [] = str.toCharArray ();
        int[] charCount = new int[256]; 
  
        for (int i = 0; i < length; i++) {
            charCount[ch[i]]++; 
        }
            for (int i = 0; i < 256; i++) { 
            if (charCount[i] != 0) { 
                System.out.println("Number of Occurrence of " + (char)i +  
                        " is " + charCount[i]); 
            } 
        }
    }
}


