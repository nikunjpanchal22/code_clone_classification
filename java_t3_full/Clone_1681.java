public int [] zeroFront (int [] nums) {
    if (nums == null) {
        return null;
    }
    int zerosPos = 0;
    for (int i = 0;
    i < nums.length; ++ i) {
        if (nums [i] == 0) {
            num [i] = num [zerosPos];
            num [zerosPos] = 0;
            ++ zerosPos;
        }
    }
    return num;
}


 public int [] zeroFront (int [] array) {
    if (array == null) {
        return null;
    }
    
    int zeroLoc = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == 0) {
            int tempVal = array[zeroLoc];
            array[zeroLoc] = array[i];
            array[i] = tempVal;
            zeroLoc++;
        }
    }
    return array;
}


