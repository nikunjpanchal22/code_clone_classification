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
    int[] solutionMonitor = new int[X];
    int filledSpots = 0;
    for (int i = 0; i < A.length; i++) {
        if(solutionMonitor[A[i]-1] == 0){
            solutionMonitor[A[i]-1] = A[i];
            filledSpots++;
            if (filledSpots == X){
                answer = i;
                break;
            }
        }
    }
    return answer;
}


