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





public static int solution(Integer N) {
    String binary = Integer.toBinaryString(N);
    int maxLength = 0;
    int zeroCount = 0;

    for(char c : binary.toCharArray()) {
        if(c == '0')
            zeroCount++;
        else {
            if(zeroCount > maxLength)
                maxLength = zeroCount;
            zeroCount = 0;
        }
    }

    return maxLength;
}


