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
    int[] bits = new int[32];
    for (int i = 0; N != 0; N >>= 1) {
        bits[i++] = (N & 1);
    }
    for (int i = 0; i < 32; ++i) {
        if (bits[i] == 1) {
            int temp = 0;
            while (++i < 32 && bits[i] == 0) {
                ++temp;
            }
            if (i < 32) {
                result = Math.max(result, temp);
            }
        }
    }
    return result;
}


