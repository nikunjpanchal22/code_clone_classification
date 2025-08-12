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
    String binary = Integer.toBinaryString(N);
    int gap = 0, counter = 0;
    for(int i = 0; i < binary.length(); i++){
        if(binary.charAt(i) == '0'){
            counter++;
        }else {
            if(counter > gap)
                gap = counter;
            counter = 0;
        }
    }
    return gap;
}


