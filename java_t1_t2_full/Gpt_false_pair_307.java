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
    int answer = -1;
    int[] elementsProcessed = new int [X+1];
    int numberofXs = 0;
    for (int i = 0; i < A.length; i++) {
        if(elementsProcessed[A[i]] == 0){
            elementsProcessed[A[i]] = A[i];
            numberofXs += 1;
            if (numberofXs == X) {
                return i;
            }
        }
    }
    return answer;
}
