static int countClamps (int [] arr) {
    int result = 0;
    int prev = 0;
    boolean same = false;
    for (int i = 0;
    i < arr.length; i ++) {
        if (i == 0) {
            prev = arr [i];
        } else {
            if (arr [i] == prev) {
                if (! same) {
                    result ++;
                    same = true;
                }
            } else {
                prev = arr [i];
                same = false;
            }
        }
    }
    return result;
}


  static int countClamps(int[] array) {
    int clamps = 0;
    int prev = array[0];
    boolean isSame = false;

    for (int i = 0; i < array.length; i++) {
        if (array[i] == prev) {
            if (!isSame) {
                clamps++;
                isSame = true;
            }
        } else {
            prev = array[i];
            isSame = false;
        }
    }
    return clamps;
}


