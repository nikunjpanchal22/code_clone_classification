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
    char[] letters = str.toCharArray();
    Arrays.sort(letters);
    int count = 1;
    for(int i = 1; i < letters.length; i++){
        if(letters[i] != letters[i - 1]){
            System.out.println("Number of Occurrence of '" + letters[i - 1] + "' is: " + count);
            count = 0;
        }
        count++;
    }
    System.out.println("Number of Occurrence of '" + letters[letters.length - 1] + "' is: " + count);
}


