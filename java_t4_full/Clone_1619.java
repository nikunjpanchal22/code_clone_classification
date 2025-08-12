public int [] zeroFront (int [] nums) {
    if (nums == null) {
        return null;
    }
    int [] result = new int [nums.length];
    int zeroesPos = 0;
    int othersPos = result.length - 1;
    for (int i = 0;
    i < nums.length; ++ i) {
        if (nums [i] == 0) {
            result [zeroesPos] = 0;
            ++ zeroesPos;
        } else {
            result [othersPos] = nums [i];
            -- othersPos;
        }
    }
    return result;
}


 public int [] zeroFront(int [] nums) {
    if (nums == null) {
        return null;
    }
    int [] result = new int [nums.length];
    int zeroesCount = 0;

    for(int i=0;i<nums.length;i++) {
        if(nums[i] == 0) {
            zeroesCount++;
        }
    }

    int index = 0;
    while (zeroesCount > 0) {
        result[index] = 0;
        index++;
        zeroesCount--;
    }

    for(int i=0;i<nums.length;i++) {
        if(nums[i] != 0) {
            result[index] = nums[i];
            index++;
        }
    }

    return result;
}


