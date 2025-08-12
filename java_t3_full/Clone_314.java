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
    Stack stack = new Stack ();
    for (int i = 0; i < nums.length; i ++) {
        stack.push (nums[i]);
    }
    while (!stack.isEmpty ()) {
        int test = (int) stack.pop ();
        if (Collections.frequency (Arrays.asList (nums), test) == 1)
            answer = test;
    }
    return answer;
}


