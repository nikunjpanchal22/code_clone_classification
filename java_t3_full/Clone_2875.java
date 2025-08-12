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
    boolean flag = false;
    int count3 = 0;
    for (int i: nums) {
        if (i == 3) {
            if (flag) {
                return false;
            }
            flag = true;
            count3++;
        } else {
            flag = false;
        }
    }

    return count3 == 3;
}


