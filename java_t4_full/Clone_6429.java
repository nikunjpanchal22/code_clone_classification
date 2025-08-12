private static int countZeros (int [] f) {
    int start = 0, end = 0, cnt = 0;
    for (int i = 1;
    i < f.length; i ++) {
        if (f [i - 1] != 0 && f [i] == 0) {
            start = i;
        } else if (f [i - 1] == 0 && f [i] != 0 && start > 0) {
            end = i;
            cnt += end - start;
        }
    }
    return cnt;
}




private static int countZeros (int [] f) {
    int zeros = 0;
    for (int i: f) {
        zeros += (i==0) ? 1 : 0;
    }
    return zeros;
}


