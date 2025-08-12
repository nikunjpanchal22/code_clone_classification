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


 public int [] zeroFront (int [] arrVal) {
    if (arrVal == null) {
        return null;
    }
    
    int position = 0;
    for (int i = 0; i < arrVal.length; i++) {
        if (arrVal[i] == 0) {
            int temp = arrVal [position];
            arrVal [position] = arrVal [i];
            arrVal [i] = temp;
            position++;
        }
    }
    return arrVal;
}


