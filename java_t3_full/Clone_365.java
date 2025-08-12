public static int solution (int X, int [] A) {
    int [] counter = new int [X + 1];
    int ans = - 1;
    int x = 0;
    for (int i = 0;
    i < A.length; i ++) {
        if (counter [A [i]] == 0) {
            counter [A [i]] = A [i];
            x += 1;
            if (x == X) {
                return i;
            }
        }
    }
    return ans;
}


 public static int solution (int X, int [] A) {
    int ans = -1;
    Map<Integer,Integer> map = new HashMap<>();
    int x = 0;
    for (int i = 0; i < A.length; i++) {
        //if map size is is below X and the number is not in the map, add the number and increment x
        if ((map.size() < X) && (!map.containsKey(A[i]))) {
            map.put(A[i],A[i]);
            x++;
        }
        if (x == X) {
            return i;
        }
    }
    return ans;
}


