public int [] rotate (int [] nums, int k) {
    if (k > nums.length) k = k % nums.length;
    int [] result = new int [nums.length];
    System.arraycopy (nums, k + 1, result, 0, k);
    System.arraycopy (nums, 0, result, k + 1, nums.length - 1);
    nums = result;
    return result;
}





public int[] rotate(int[] nums, int k) {
    for(int i = 0; i < k; i++){
        int prev = nums[nums.length - 1];
        for(int j = 0; j < nums.length; j++){
            int temp = nums[j];
            nums[j] = prev;
            prev = temp;
        }
    }
    return nums;
}


