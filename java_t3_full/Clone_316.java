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
    HashMap<Integer, Integer> hm = new HashMap<> ();
    for (int i = 0; i < nums.length; i ++) {
        hm.put (nums[i], hm.getOrDefault (nums[i], 0) + 1);
    }
    for (int i = 0; i < nums.length; i ++) {
        if (hm.get (nums[i]) == 1) {
            answer = nums[i];
        }
    }
    return answer;
}


