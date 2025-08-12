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
    int zero = 0, nonZero = nums.length-1;
    while(zero < nonZero) {
        if(nums[zero] != 0) {
            int temp = nums[zero];
            nums[zero] = nums[nonZero];
            nums[nonZero] = temp;
            nonZero--;
        } else {
            zero++;
        }
    }
    return nums;
}


