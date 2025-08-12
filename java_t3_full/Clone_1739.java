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
    int result = 0;
    int last = arr[0];
    
    boolean repeated = false;
    
    for(int i = 1; i < arr.length; i++) {
        if(arr[i] == last) {
            if(!repeated) {
                result++;
                repeated = true;
            }
        } else {
            last = arr[i];
            repeated = false;
        }
    }
    
    return result;
}


