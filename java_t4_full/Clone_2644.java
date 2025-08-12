public static int maxBlock (String str) {
    int maxCounter = 1;
    int counter = 1;
    if (str.length () == 0) {
        return 0;
    }
    for (int i = 1;
    i < str.length (); i ++) {
        if (str.charAt (i - 1) == str.charAt (i)) {
            counter ++;
        } else {
            if (counter > maxCounter) {
                maxCounter = counter;
            }
            counter = 1;
        }
    }
    return Math.max (maxCounter, counter);
}



 

public static int maxBlock(String str) {
    return Math.toIntExact(java.util.stream.IntStream.range(0, str.length()-1).mapToObj(i -> new int[] {i, str.lastIndexOf(str.charAt(i),str.length()-1)}).mapToInt(arr -> arr[1]-arr[0]).filter(dist -> str.substring(dist, dist+1).equals(str.substring(dist+1))).max().orElse(0)+1);
}


