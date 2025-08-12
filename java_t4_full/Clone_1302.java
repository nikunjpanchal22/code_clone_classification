public static int [] removeDuplicates (int [] arr) {
    boolean [] set = new boolean [1001];
    int totalItems = 0;
    for (int i = 0;
    i < arr.length; ++ i) {
        if (! set [arr [i]]) {
            set [arr [i]] = true;
            totalItems ++;
        }
    }
    int [] ret = new int [totalItems];
    int c = 0;
    for (int i = 0;
    i < set.length; ++ i) {
        if (set [i]) {
            ret [c ++] = i;
        }
    }
    return ret;
}


 public static int[] removeDuplicates(int[] arr) {
   Set<Integer> seen = new HashSet<>();
   int[] ret = new int[arr.length];
   int c = 0;
   for (int i = 0; i < arr.length; i++) {
      if (seen.add(arr[i])) {
          ret[c++] = arr[i];
      }
   }
   return Arrays.copyOf(ret, c);
}


