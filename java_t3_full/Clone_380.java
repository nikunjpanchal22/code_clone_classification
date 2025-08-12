public int solution (int X, int [] A) {
    Set < Integer > set = new HashSet < Integer > ();
    int sum1 = 0, sum2 = 0;
    for (int i = 0;
    i <= X; i ++) {
        sum1 += i;
    }
    for (int i = 0;
    i < A.length; i ++) {
        if (set.contains (A [i])) continue;
        set.add (A [i]);
        sum2 += A [i];
        if (sum1 == sum2) return i;
    }
    return - 1;
}


 public int solution(int X, int[] A) 
    { 
        // Initialize result 
        int ans = -1; 
  
        // To store sum of array 
        int sum_array = 0; 
  
        // To store sum upto X 
        int sum_x = (X * (X + 1)) / 2; 
  
        // To store occurrence of each elements 
        HashMap<Integer, Integer> hmap 
            = new HashMap<Integer, Integer>(); 
  
        // Iterating over array 
        for (int i = 0; i < A.length; i++) { 
  
            // If element is present first time 
            // add its value to sum_array and 
            // store its index to hmap 
            if (hmap.get(A[i]) == null) { 
                hmap.put(A[i], i); 
                sum_array += A[i]; 
            } 
  
            // If sum upto X is equals to sum_array 
            // that means all element from 1 to X are 
            // present in given array store result 
            if (sum_x == sum_array) { 
                ans = i; 
            } 
        } 
        return ans; 
    } 

 public int solution (int X, int [] A) {
    int sum1 = 0, sum2 = 0;
    // Store the elements in Hashmap
    HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
    for (int i = 1; i <= X; i++) {
        sum1 += i;
    }
    // Store the first occurrence of each element
    for (int i = 0; i < A.length; i++) {
        if (!hs.containsKey(A[i])) {
            hs.put(A[i], A[i]);
            sum2 += A[i];
            if (sum1 == sum2) return i;
        }
    }
    return -1;
}


