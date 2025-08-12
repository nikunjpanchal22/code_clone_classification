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
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i = i+2) {
        if (nums[i] != nums[i-1]) return nums[i-1];
    }
    return nums[nums.length - 1];
}


