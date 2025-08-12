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
    int threeFound = 0;
    boolean gotThreeLast = false;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            if (gotThreeLast == true) {
                return false;
            } else {
                threeFound++;
                gotThreeLast = true;
            }
        } else {
            gotThreeLast = false;
        }
    }
    return threeFound == 3;
}
