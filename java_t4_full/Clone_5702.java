public int [] zeroFront (int [] nums) {
    if (nums == null) {
        return null;
    }
    int zerosPos = 0;
    for (int i = 0;
    i < nums.length; ++ i) {
        if (nums [i] == 0) {
            num [i] = num [zerosPos];
            num [zerosPos] = 0;
            ++ zerosPos;
        }
    }
    return num;
}




public int[] zeroFront(int[] nums) {
    if (nums == null) return null;
    for (int i = nums.length - 1, j = nums.length - 1; i >= 0; i--) 
        if (nums[i] != 0) nums[j--] = nums[i];
    for (int i = 0; i < nums.length; i++) nums[i] = i >= zerosPos ? 1 : 0;
    return nums;
}


