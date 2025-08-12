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
    int totalThrees = 0;
    boolean immediatelyThree = false;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            if (immediatelyThree == true) {
                return false;
            } else {
                totalThrees++;
                immediatelyThree = true;
            }
        } else {
            immediatelyThree = false;
        }
    }
    return totalThrees == 3;
}
