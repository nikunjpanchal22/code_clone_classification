public int solution (int X, int [] A) {
    int size = A.length;
    int [] check = new int [X];
    int cmp = 0;
    int time = - 1;
    for (int x = 0;
    x < size; x ++) {
        int temp = A [x];
        if (temp <= X) {
            if (check [temp - 1] > 0) {
                continue;
            }
            check [temp - 1] ++;
            cmp ++;
        }
        if (cmp == X) {
            time = x;
            break;
        }
    }
    return time;
}




public int solution(int X, int[] A) {
    Map<Integer, Integer> checkStatus = new HashMap<>();
    int cover = 0;
    for(int idx=0;idx<A.length;idx++) {
        int val = A[idx];
        if(val <= X && !checkStatus.containsKey(val)) {
            checkStatus.put(val, idx);
            cover++;
            if(cover == X) {
                return idx;
            }
        }
    }
    return -1;
}


