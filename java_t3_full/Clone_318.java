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



 public static int singleNumber(int[] nums) {
    int answer = 0;
    TreeSet<Integer> ts = new TreeSet<>();
    for (int i = 0; i < nums.length; i ++) {
        ts.add (nums[i]);
    }
    for (int i = 0; i < nums.length; i ++) {
        if (!ts.contains (nums[i]))
            answer = nums[i];
    }
    return answer;
}


