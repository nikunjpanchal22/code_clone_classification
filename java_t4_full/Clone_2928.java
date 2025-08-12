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
    List<Integer> no_duplicate_list = new ArrayList<>();
    for (int i : nums) {
        if (!no_duplicate_list.contains(i)) {
            no_duplicate_list.add(i);
        } else {
            no_duplicate_list.remove(new Integer(i));
        }
    }
    return no_duplicate_list.get(0);
}


