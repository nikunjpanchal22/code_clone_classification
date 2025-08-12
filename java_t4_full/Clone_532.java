private static int solution (int N) {
    int gap = 0;
    String binaryStr = Integer.toBinaryString (N);
    String [] zeroArrays = binaryStr.split ("1");
    System.out.println (Arrays.toString (zeroArrays));
    for (String zeroArray : zeroArrays) {
        gap = zeroArray.length () > gap ? zeroArray.length () : gap;
    }
    return gap;
}



 private static int solution (int N) {
    int gap = 0;
    String binaryStr = Integer.toBinaryString (N);
    String[] zeroArrays = binaryStr.split("1");
    List<Integer> zerolist = new ArrayList <>();
    for (String s : zeroArrays) {
        int count = 0;
        for (int i = 0; i < s.length (); i++) {
            if (s.charAt (i) == '0') {
                count++;
            }
        }
        zerolist.add (count);
    }
    System.out.println (zerolist.toString ());
    gap = Collections.max (zerolist);
    return gap;
}


