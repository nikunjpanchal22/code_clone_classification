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
    if (nums == null) return null;
    int[] res = new int[nums.length];
    int count = 0;
    for (int i : nums) 
        if (i == 0) count++;
    for (int i = 0; i < nums.length; i++) 
        res[i] = (i < count) ? 0 : nums[i-count];
    return res;
}


