public int solution (int X, int [] A) {
    int len = A.length;
    if (X > len) {
        return - 1;
    }
    int [] isFilled = new int [X];
    int jumped = 0;
    Arrays.fill (isFilled, 0);
    for (int i = 0;
    i < len; i ++) {
        int x = A [i];
        if (x <= X) {
            if (isFilled [x - 1] == 0) {
                isFilled [x - 1] = 1;
                jumped += 1;
                if (jumped == X) {
                    return i;
                }
            }
        }
    }
    return - 1;
}



 

public int solution(int X, int[] A) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int index = A.length - 1; index >= 0; index--) {
        map.put(A[index], index);
    }
    int earliestTime = -1;
    for(int i = 1; i < X +1; i++) {
        Integer time = map.get(i);
        if(time != null && time > earliestTime) earliestTime = time;
        if(time == null) return -1;
    }
    return earliestTime;
}


