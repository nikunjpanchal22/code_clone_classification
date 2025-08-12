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


 public int solution (int n) {
	int res = 0;
	while (n > 0) {
		if ((n & 1) == 1) {
			int temp = 0;
			int flag = 0;
			while (flag == 0) {
				if ((n & 1) != 1) {
					temp++;
					n >>>= 1;
				} else {
					flag = 1;
					n = 0;
				}
			}
			res = Math.max(res, temp);
		}
		n >>>= 1;
	}
	return res;
}


