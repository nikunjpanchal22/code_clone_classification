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
    LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
    for (int i = 0; i < nums.length; i ++) {
        if (lhs.add (nums[i]))
            sn++;
        else
            lhs.remove (nums[i]);
    }
    Iterator itr = lhs.iterator (); 
    answer = (Integer)itr.next ();
    return answer;
}


