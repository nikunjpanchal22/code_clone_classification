public int solution (int N) {
    int result = 0;
    while (N > 0) {
        if ((N & 1) == 1) {
            int temp = 0;
            while ((N>>= 1) > 0 && ((N & 1) != 1)) {
                temp ++;
            }
            result = Math.max (result, temp);
        } else {
            N>>= 1;
        }
    }
    return result;
}





public int solution(int N) {
    int result = 0;
    String binaryString = Integer.toBinaryString(N);
    for (int i = 0; i < binaryString.length(); i++) {
        int current = 0;
        while (binaryString.charAt(i) == '0' && ++i < binaryString.length()) current++;
        result = Math.max(result, current);
    }
    return result;
}


