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
    int pos = 0;
    for (int i = 0; i < nums.length; i++) if (nums[i] == 0) nums[pos++] = 0;
    for (int i = pos; i < nums.length; i++) nums[i] = 1;
    return nums;
}


