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
    int count = 0;
    while (N > 0) {
        N >>= 1;
        if ((N & 1) == 0)
            count ++;
        else {
            result = Math.max(result, count);
            count = 0;
        }
    }
    return result;
}


