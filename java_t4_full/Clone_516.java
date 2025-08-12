public static int solution (Integer number) {
    String binary = Integer.toBinaryString (number);
    String [] gaps = binary.split ("1");
    String biggestGap = "";
    for (int i = 0;
    i < (binary.endsWith ("1") ? gaps.length : gaps.length - 1); i ++) {
        if (gaps [i].contains ("0") && gaps [i].length () > biggestGap.length ()) biggestGap = gaps [i];
    }
    return biggestGap.length ();
}


 public static int solution (Integer number) {
    String binary = Integer.toBinaryString (number);
    Stack<Character> stack = new Stack<>();
    int maxLen = 0;
    int len = 0;
    for (int i = 0; i < binary.length(); i++) {
        char ch = binary.charAt(i);
        if (ch == '1') {
            if (len > maxLen) {
                maxLen = len;
            }
            len = 0;
        } else stack.add('0');
        len++; 
    }
    
    return maxLen; 
}


