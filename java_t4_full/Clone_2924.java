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
    int[] count = new int[32];
    for (int num : nums) {
        for (int i = 0; i < 32; i++) {
            if (((num >> i) & 1) == 1) {
                count[i]++;
            }
        }
    }
    int result = 0;
    for (int i = 0; i < 32; i++) {
        if (count[i] % 2 != 0) {
            result += (1 << i);
        }
    }
    return result;
}


