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


 public int [] zeroFront (int [] values) {
    if (values == null) {
        return null;
    }
    
    int posZero = 0;
    for (int i = 0; i < values.length; i++) {
        if (values[i] == 0) {
            int temp = values[i];
            values[i] = values[posZero];
            values[posZero] = temp;
            posZero++;
        }
    }
    return values;
}


