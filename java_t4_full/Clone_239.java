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
    int[] resultArr = new int[nums.length];
    int resultArrCounter = 0;
    for (int i = 0; i < nums.length; i ++) {
        int test = nums[i];
        int counter = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == test) {
               counter++; 
            }
        }
        if (counter == 1) {
            resultArr[resultArrCounter]=test;
            resultArrCounter++;
        }
    }
    if (resultArr.length > 0) {
        answer = resultArr[0];
    }
    return answer;
}


