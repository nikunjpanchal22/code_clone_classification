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
    List<Integer> list = Arrays.stream (nums).boxed ().collect (Collectors.toList ());
    for (int i = 0; i < list.size (); i++) {
        int index = list.lastIndexOf (list.get (i));
        if (list.indexOf (list.get (i)) == index)
            answer = list.get (i);
    }
    return answer;
}


