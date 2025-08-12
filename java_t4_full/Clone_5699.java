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
    int pointer = nums.length-1;
    for (int i = nums.length-1; i >= 0; i--)
        if (nums[i] != 0) nums[pointer--] = nums[i];
    while (pointer >=0) nums[pointer--] = 0;
    return nums;
}


