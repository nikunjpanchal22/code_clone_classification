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




public int solution(int X, int[] A) 
    { 
        int cmp = 0; 
        int time = -1; 
          
        boolean[] present = new boolean[X + 1]; 
          
        // Iterate over given array 
        for (int x = 0; x < A.length; x++)  
        { 
            // Take element 
            int temp = A[x]; 
              
            // Check for range 
            if (temp <= X && !present[temp])  
            { 
                // Increment count 
                cmp++; 
                  
                // Mark element as present 
                present[temp] = true; 
            } 
            // Check for required condition 
            if (cmp == X)  
            { 
                // Return count 
                time = x; 
              
                // We got required result to  
                // terminate loop 
                break; 
            } 
        } 
        return time; 
    } 

 
public int solution(int X, int[] A) {
    int size = A.length;
    int[] check = new int[X];
    int cmp = 0;
    int time = -1;
  
    for (int x = 0; x < size; x++) {
        int temp = A[x];
        if (temp <= X) {
            int index = temp - 1;
            if (check[index] > 0) {
               continue;
            }
            check[index] = 1;
            cmp++;
        }
        if (cmp == X) {
            time = x;
            break;
        }
    }
    return time;
}
