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


public int solution (int N) {
    int max_length = 0;
    int temp_length = 0;
    while (N > 0) {
        if ((N & 1) == 1) {
            temp_length = 0;
            while ((N>>= 1) > 0 && ((N & 1) != 1)) {
                temp_length ++;
            }
            max_length = Math.max (max_length, temp_length);
        } else {
            N>>= 1;
        }
    }
    return max_length;
}
