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


 public int [] zeroFront (int [] data) {
    if (data == null) {
        return null;
    }
    
    int zeroPos = 0;
    for (int i = 0; i < data.length; i++) {
        if (data[i] == 0) {
            int tmp = data[zeroPos];
            data[zeroPos] = data[i];
            data[i] = tmp;
            zeroPos++;
        }
    }
    return data;
}


