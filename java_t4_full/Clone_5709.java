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





public int[] zeroFront(int[] nums) {
    if (nums == null) return null;
    int writePos = 0;
    for (int readPos = 0; readPos < nums.length; readPos++) {
        if (nums[readPos] == 0) {
            int temp = nums[writePos];
            nums[writePos] = nums[readPos];
            nums[readPos] = temp;
            writePos++;
        }
    }
    return nums;
}


