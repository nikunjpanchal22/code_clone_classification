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
    int[] arr = new int [X];
    int answer = -1;
    int len = A.length;
    int count = 0;
    
    for (int i = 0; i < len; i++) {
        if (arr[A[i]-1] == 0) {
            count++;
            arr[A[i]-1] = 1;
        }
        if (count == X) {
            answer = i;
            break;
        }
    }
    return answer;
}


