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
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for(int num : nums) {
        if(map.get(num) == 1) {
            return num;
        }
    }
    return -1;
}


