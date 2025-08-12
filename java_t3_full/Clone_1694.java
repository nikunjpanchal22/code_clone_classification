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


 public int [] zeroFront (int [] nums) {
     if (nums == null) {
        return null;
    }
    int [] result = new int [nums.length];
    int zerosIndex = 0;
    int othersIndex = result.length - 1;
    int counter = 0;
    while (counter < nums.length) {
        if (nums[counter] == 0) {
            result[zerosIndex] = 0;
            zerosIndex++;
            counter++;
        } else {
            result[othersIndex] = nums[counter];
            othersIndex--;
            counter++;
        }
    }
    return result;
}


