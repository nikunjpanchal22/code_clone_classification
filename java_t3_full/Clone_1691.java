public int [] zeroFront (int [] nums) {
    if (nums == null) {
        return null;
    }
    int [] result = new int [nums.length];
    int zeroesPos = 0;
    int othersPos = result.length - 1;
    for (int i = 0;
    i < nums.length; ++ i) {
        if (nums [i] == 0) {
            result [zeroesPos] = 0;
            ++ zeroesPos;
        } else {
            result [othersPos] = nums [i];
            -- othersPos;
        }
    }
    return result;
}


 public int [] zeroFront(int [] nums) {
    if (nums == null) {
        return null;
    }
    int [] result = new int [nums.length];
    int numZeroes = 0;

    for (int i = 0; i < nums.length; ++i) {
        if (nums [i] == 0) {
            result [i - numZeroes] = 0;
            numZeroes++;
        }
    }

    for (int i = 0; i < nums.length; ++i) {
        if (nums [i] != 0) {
            result [(nums.length - i - 1) + numZeroes] = nums [i];
        }
    }
    return result;
}


