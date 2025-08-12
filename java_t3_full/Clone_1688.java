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
    int zeroIndex = 0;
    for (int i = 0; i < nums.length; ++ i) {
        if (nums[i] == 0) {
            result[zeroIndex] = 0;
            zeroIndex++;
        }
    }
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != 0) {
            result[zeroIndex] = nums[j];
            zeroIndex++;
        }
    }
    return result;
}


