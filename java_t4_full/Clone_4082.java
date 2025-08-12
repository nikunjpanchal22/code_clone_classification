public int [] rotate (int [] nums, int k) {
    if (k > nums.length) k = k % nums.length;
    int [] result = new int [nums.length];
    System.arraycopy (nums, k + 1, result, 0, k);
    System.arraycopy (nums, 0, result, k + 1, nums.length - 1);
    nums = result;
    return result;
}





public int[] rotate(int[] nums, int k) {
    if(nums.length < 2 || k % nums.length == 0) return nums;
    k %= nums.length;
    int[] result = new int[nums.length];
    int startCountVal = (k > 0) ? k : nums.length;
    int resultFiller = nums.length - startCountVal;
    for (int i = 0; i < startCountVal; i++) {
        result[i]= nums[resultFiller++];
    }
    for (int i = startCountVal, j=0; i < nums.length; i++, j++) {
        result[i] = nums[j];
    }
    return result;
}


