public static int singleNumber (int [] nums) {
    int answer = 0;
    ArrayList al = new ArrayList ();
    for (int i = 0;
    i < nums.length; i ++) {
        al.add (nums [i]);
    }
    for (int i = 0;
    i < nums.length; i ++) {
        int test = nums [i];
        if (al.indexOf (test) == al.lastIndexOf (test)) {
            answer = nums [i];
        }
    }
    return answer;
}


 public static int singleNumber (int [] nums) {
    int answer = 0;
    Set<Integer> set = new TreeSet<>();
    for (int i = 0; i < nums.length; i ++) {
        int test = nums [i];
        int uniqueCounter = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == test) {
               uniqueCounter++; 
            }
        }
        if (uniqueCounter == 1) {
            answer = test;
        }
    }
    return answer;
}


