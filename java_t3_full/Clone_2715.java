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
    int i = 0;
    while(i < nums.length) {
        if (nums[i] != 13) {
            sum += nums[i];
        } else {
            ++i;
        }
        ++i;
    }
    return sum;
}


