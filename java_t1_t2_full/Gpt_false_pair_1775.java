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
    int threesNum = 0;
    boolean followThree = false;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            if (followThree == true) {
                return false;
            } else {
                threesNum++;
                followThree = true;
            }
        } else {
            followThree = false;
        }
    }
    return threesNum == 3;
}
