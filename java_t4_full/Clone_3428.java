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
    return Integer.toBinaryString(N)
                  .split("1")
                  [0]
                  .chars()
                  .map(x -> x == '0' ? 1 : 0)
                  .max()
                  .orElse(0);
}


