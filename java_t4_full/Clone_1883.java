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
        Arrays.sort (ch);
        Integer prev = null;
        int count = 0;
        for(char one : ch) {
            if(null != prev && !prev.equals(one)) {
                System.out.println("Number of Occurrence of '" + prev + "' is: " + count); 
                prev = one;
                count = 0;
            }
            count++;
            prev = one;
        }
        
        if(count > 0) {
            System.out.println("Number of Occurrence of '" + prev + "' is: " + count); 
        }
    }
}


