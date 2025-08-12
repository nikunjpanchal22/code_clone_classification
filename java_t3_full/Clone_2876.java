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
    boolean flag = false;
    for (int i : nums) {
        if (i == 3 && !flag) {
            count++;
            flag = true;
        } else if (i == 3) {
            return false;
        }
        if (i != 3) {
            flag = false;
        }
    }
    return count == 3;
}


