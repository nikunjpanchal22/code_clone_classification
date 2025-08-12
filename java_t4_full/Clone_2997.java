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



public int solution (int X, int [] A) {
    HashSet<Integer> s = new HashSet<Integer>();
    int time = -1;
    for(int i=0; i<A.length; i++) {
        if(A[i] <= X) {
            s.add(A[i]);
            time = i;
        }
        if(s.size() == X) break;
    }
    return time;
}


