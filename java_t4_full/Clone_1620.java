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


  public int [] zeroFront (int [] nums) {
    if (nums == null || nums.length < 1) {
        return null;
    }
    int size = nums.length; 
    int [] result = new int [size];
    int left = 0;
    int right = size - 1;
    while (left < size && right > -1) {
        if (nums[left] == 0) {
            result[left++] = 0;
        } else if (nums[right] != 0) {
            result[right--] = nums[right];
        } else {
            result[left++] = nums[right--];
        }
    }
    return result;
}


