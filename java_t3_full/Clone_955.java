public int sum13 (int [] nums) {
    int sum = 0;
    for (int i = 0;
    i < nums.length; i ++) {
        if (nums [i] != 13) {
            sum += nums [i];
        } else {
            i ++;
        }
    }
    return sum;
}


  public int sum13 (int [] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i ++) {
        if (nums [i] != 13 || nums [i] == 13 && i + 1 < nums.length && nums [i + 1] != 13) {
            if(nums[i] == 13) {
                sum -= nums[i];
            } else {
                sum += nums[i];
            }
        } else {
            i ++;
        }
    }
    return sum;
}


