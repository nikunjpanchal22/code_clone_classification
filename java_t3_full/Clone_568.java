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
	int result = 0;
	while (n > 0) {
		if ((n & 1) == 1) {
			int temp = 0;
			while ((n>>>= 1) > 0) {
				if ((n & 1) == 1) {
					break;
				} else {
					temp ++;
				}
			}
			result = Math.max (result, temp);
		} else {
			n>>>= 1;
		}  
	}
	return result;
}


