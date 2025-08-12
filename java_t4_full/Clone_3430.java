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





public static int solution(Integer number) {
    int max = 0;
    int count = 0;

    while ((number & 1) == 0) {
        number >>>= 1;
    }

    while (number != 0) {
        if ((number & 1) == 0) {
            count++;
        } else {
            max = Math.max(max, count);
            count = 0;
        }
        number >>>= 1;
    }
    return max;
}


