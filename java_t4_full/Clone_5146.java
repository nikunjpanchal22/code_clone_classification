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
    for(int i = 0; i < nums.length -3; i++) {
        if(nums[i] == 3 && nums[i+1] != 3 && 
           nums[i+2] == 3 && nums[i+3] != 3 && 
           nums[i+4] == 3 && nums[i+5] != 3) {
            count++;
        }
    }
    return count == 3;
}


