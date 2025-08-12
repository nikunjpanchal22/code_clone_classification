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
            int result = 0, temp = 0;
            while (N != 0) {
                if ((N & 1) != 0)
                    temp = countZeros(N);
                if (temp > result)
                    result = temp;
                N >>= 1;
            }
            return result;
        }

        public int countZeros(int N) {
            int count = 0;
            while ((N & 1) == 0 && N != 0) {
                count++;
                N >>= 1;
            }
            return count;
}


