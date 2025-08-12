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
    int counter3s = 0;
    boolean threeSeen = false;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            if (threeSeen) {
                return false;
            } else {
                counter3s++;
                threeSeen = true;
            }
        } else {
            threeSeen = false;
        }
    }
    return counter3s == 3;
}
