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
    List<Integer> list = new ArrayList<Integer>();
    for(int n:nums){
        if(list.contains(n))
            list.remove(new Integer(n));
        else
            list.add(n);
    }
    return list.get(0);
}


