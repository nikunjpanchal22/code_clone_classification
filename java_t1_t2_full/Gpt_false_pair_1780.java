public boolean haveThree (int [] nums) {
    int count = 0;
    boolean flag = false;
    for (int i = 0;
    i < nums.length; i ++) {
        if (nums [i] == 3) {
            if (flag) {
                return false;
            } else {
                count ++;
                flag = true;
            }
        } else {
            flag = false;
        }
    }
    return count == 3;
}


 public boolean haveThree(int[] nums) {
    int total = 0;
    boolean ifThree = false;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            if (ifThree) {
                return false;
            } else {
                total++;
                ifThree = true;
            }
        } else {
            ifThree = false;
        }
    }
    return total == 3;
}
