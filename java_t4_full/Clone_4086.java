public int [] rotate (int [] nums, int k) {
    if (k > nums.length) k = k % nums.length;
    int [] result = new int [nums.length];
    System.arraycopy (nums, k + 1, result, 0, k);
    System.arraycopy (nums, 0, result, k + 1, nums.length - 1);
    nums = result;
    return result;
}





public int[] rotate(int[] nums, int k) {
            int len = nums.length;
            if(len == 0 || len == 1)
                return nums;
            k = k % len;
            reverse(nums, 0, len-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, len-1);
            return nums;
        }
        public void reverse(int[] nums, int i, int j)
        {
            int li = i;
            int hi = j;
            while(li<hi)
            {
                int temp = nums[li];
                nums[li] = nums[hi];
                nums[hi] = temp;
                li++;
                hi--;
            }
}


