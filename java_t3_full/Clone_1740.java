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
    int result = 0;
    int store = array[0];
    boolean match = false;
    for(int i=1; i<array.length; i++) {
        if(array[i] == store) {
            if(!match) {
                result++;
                match = true;
            }
        } else {
            store = array[i];
            match = false;
        }
    }
    return result;
}


