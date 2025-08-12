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
    int[] freq = new int[256];
    int length = str.length();
    for(int i = 0; i < length; i++)
        freq[str.charAt(i)]++;
    for(int i = 0; i < 256; i++)
        if(freq[i] != 0)
            System.out.println("Number of Occurrence of '" + (char)i + "' is: " + freq[i]);
}


