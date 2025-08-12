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
    int counter = 0;
    for (int num : nums) if (num == 0) counter++;
    for (int i = 0; i < nums.length; i++) nums[i] = i < counter ? 0 : nums[i];
    return nums;
}


