public int [] rotate (int [] nums, int k) {
    if (k > nums.length) k = k % nums.length;
    int [] result = new int [nums.length];
    System.arraycopy (nums, k + 1, result, 0, k);
    System.arraycopy (nums, 0, result, k + 1, nums.length - 1);
    nums = result;
    return result;
}





public static int[] rotate(int[] nums, int k) {
    k = k % nums.length;
    int[] result = new int[nums.length];
    for(int i = 0; i < k; i++) {
        result[i] = nums[nums.length-k+i];
    }
    int j = 0;
    for(int i = k; i < nums.length; i++) {
        result[i] = nums[j];
        j++;
    }
    System.arraycopy(result, 0, nums, 0, nums.length);
    return nums;
}


