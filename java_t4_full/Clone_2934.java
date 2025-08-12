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





public static int singleNumber (int [] nums) {
    int answer = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
        if (!map.containsKey(num)) {
            map.put(num, 1);
        } else {
            map.put(num, map.get(num) + 1);
        }
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 1) {
            answer = entry.getKey();
            break;
        }
    }
    return answer;
}


