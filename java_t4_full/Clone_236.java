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
    List<Integer> list = new ArrayList<> ();
    for (int i = 0; i < nums.length; i ++) {
        if (list.contains (nums[i]))
            list.remove (nums[i]);
        else
            list.add (nums[i]);
    }
    answer = list.get (0);
    return answer;
}


