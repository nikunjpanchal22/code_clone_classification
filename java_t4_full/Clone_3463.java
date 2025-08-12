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
    Integer result = 0, temp;
    while (N > 0) {
        temp = 0;
        N = N >> 1;
        while ((N & 1) != 1 && N > 0) {
            temp++;
            N = N >> 1;
        }
        result = Math.max(result, temp);
    }
    return result;
}


