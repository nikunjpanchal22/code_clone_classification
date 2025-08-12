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
    boolean skip = false;
    for (int num : nums) {
        if (skip) {
            skip = false;
            continue;
        }
        if (num == 13) {
            skip = true;
            continue;
        }
        sum += num;
    }
    return sum;
}


