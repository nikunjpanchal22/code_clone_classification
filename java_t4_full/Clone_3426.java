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
    StringTokenizer st = new StringTokenizer(Integer.toBinaryString(N), "1");
    while (st.hasMoreTokens()) {
        result = Math.max(result, st.nextToken().length());
    }
    return result;
}


