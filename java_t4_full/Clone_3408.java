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
    return Collections.max(
        Arrays.stream(Integer.toBinaryString(number).split("1"))
        .filter(s -> s.contains("0"))
        .map(String::length)
        .collect(Collectors.toList()));
}


