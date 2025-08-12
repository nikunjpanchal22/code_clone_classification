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


  static int countClamps(int[] arr) {
    int count = 0;
    int prev = arr[0];
    boolean isSame = false;
    for (int i = 0; i < arr.length; i++) {
        if (i == 0)
            prev = arr[i];
        else {
            if (arr[i] == prev) {
                if (!isSame)
                    count++;
                    isSame = true;
            }
            else {
                prev = arr[i];
                isSame = false;
            }

        }
    }
    return count;
}


