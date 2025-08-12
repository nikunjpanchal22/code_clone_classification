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


 private static int solution(int N) { 
    int gap = 0;
    String binaryStr = Integer.toBinaryString(N);
    ArrayList<Integer> zeroList = new ArrayList<>();
    for (int i = 0; i < binaryStr.length(); i++) {
        int count = 0;
        while (i < binaryStr.length() && binaryStr.charAt(i) == '0') { 
            count++;
            i++;
        }
        zeroList.add(count);
    }
    System.out.println(zeroList);
    int maxCount = zeroList.get(0);
    for(int i = 1; i < zeroList.size(); i++) {
        maxCount = Math.max(maxCount, zeroList.get(i));
    }
    gap = maxCount;
    return gap;
}


