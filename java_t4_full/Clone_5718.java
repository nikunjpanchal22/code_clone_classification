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
    int begin = 0;
    int end = nums.length - 1;
    while(begin <= end) {
        if(nums[begin] == 0) {
            begin++;
        } else {
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;
            end--;
        }
    }
    return nums;
}


