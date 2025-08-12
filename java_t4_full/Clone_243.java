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
    for (int i = 0; i < nums.length; i ++) {
        int test = nums [i];
        boolean uniqueCounter = true;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == test && i != j) {
               uniqueCounter = false; 
            }
        }
        if (uniqueCounter) {
            answer = test;
        }
    }
    return answer;
}


