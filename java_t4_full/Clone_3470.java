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
    int result = 0, count = 0;
    while (N != 0) {
        if (N % 2 == 0) {
            count++;
            N /= 2;
        } else {
            result = Math.max(result, count);
            count = 0;
            N /= 2;
        }
    }
    return result;
}


