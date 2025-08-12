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
    boolean hadThree = false;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            if (hadThree == true) {
                return false;
            } else {
                count++;
                hadThree = true;
            }
        } else {
            hadThree = false;
        }
    }
    return count == 3;
}
