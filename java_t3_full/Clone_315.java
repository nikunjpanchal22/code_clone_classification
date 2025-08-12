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
    TreeMap<Integer, Integer> tm = new TreeMap<> ();
    for (int i = 0; i < nums.length; i ++) {
        tm.put (nums[i], tm.getOrDefault (nums[i], 0) + 1);
    }
    for (int i = 0; i < nums.length; i ++) {
        if (tm.get (nums[i]) == 1) {
            answer = nums[i];
        }
    }
    return answer;
}


