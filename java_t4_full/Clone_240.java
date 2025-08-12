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
    Boolean[] boolArr = new Boolean[nums.length];
    Arrays.fill(boolArr, false);
    for (int i = 0; i < nums.length; i ++) {
        int test = nums [i];
        for (int j = 0; j < nums.length; j++) {
            if (test == nums[j]) {
                boolArr[j]=true;
            }
        }
    }
    for (int i = 0; i < boolArr.length; i++) {
        if(boolArr[i]==false) {
            answer = nums[i];
        }
    }
    return answer;
}


