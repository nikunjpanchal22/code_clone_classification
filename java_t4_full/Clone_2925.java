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
    int result = 0;
    for (int i = 0; i<32; i++) {
        int sum = 0;
        for (int j=0; j<nums.length; j++) {
            if (((nums[j] >> i) & 1) == 1) {
                sum++;
                sum %= 2;
            }
        }
       if (sum != 0) {
          result |= sum << i;
       }
    }
    return result;
}


