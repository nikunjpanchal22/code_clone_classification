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


 public int [] zeroFront (int [] arr) {
    if (arr == null) {
        return null;
    }
    
    int pos = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            int temp = arr [pos];
            arr [pos] = arr [i];
            arr [i] = temp;
            pos++;
        }
    }
    return arr;
}


