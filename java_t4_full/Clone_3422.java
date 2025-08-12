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
    int result = 0, zeroCount = 0;
    for (char bit : Integer.toBinaryString(N).toCharArray()) {
        if (bit == '0') zeroCount++;
        else {
            result = Math.max(result, zeroCount);
            zeroCount = 0;
        }
    }
    return result;
}


