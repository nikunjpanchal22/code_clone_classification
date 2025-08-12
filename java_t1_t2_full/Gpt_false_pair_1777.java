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
    int count = 0;
    boolean threeFound = false;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            if (threeFound == true) {
                return false;
            } else {
                count++;
                threeFound = true;
            }
        } else {
            threeFound = false;
        }
    }
    return count == 3;
}
