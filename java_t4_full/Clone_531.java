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
    List<Integer> listOfZeros = new ArrayList<>();
    for (int i = 0; i < binaryStr.length(); i++) {
        if (binaryStr.charAt(i) == '0') {
            int count = 0;
            while (binaryStr.charAt(i) == '0') {
                count++;
                i++;
            } 
            listOfZeros.add(count); 
        } 
    }
    System.out.println(listOfZeros.toString()); 
    gap = listOfZeros.stream().max(Comparator.naturalOrder()).get();
    return gap;         
}


