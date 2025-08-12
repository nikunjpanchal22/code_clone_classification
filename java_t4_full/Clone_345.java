public int solution (int X, int [] A) {
    Set < Integer > leaves = new HashSet < > ();
    for (int i = 0;
    i < A.length; i ++) {
        leaves.add (A [i]);
        if (leaves.contains (X) && leaves.size () == X) return i;
    }
    return - 1;
}


 public int solution (int X, int [] A) { 
   int[] leaves = new int[X + 1]; 
   int count = 0; 
   for (int i = 0;
   i < A.length; i ++) { 
      if (A [i] <= X && leaves [A [i]] == 0) { 
         leaves [A [i]] ++; 
         count ++; 
      } 
      if (count == X) return i; 
   } 
   return -1; 
}


