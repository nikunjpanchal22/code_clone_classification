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
    Set<Integer> uniqueNums = new HashSet<>();
    int sumOfSet = 0, sumOfArray = 0;
    for (int num : nums) {
        if (!uniqueNums.add(num)) {
            sumOfSet += num;
        }
        sumOfArray += num;
    }
    return 2 * sumOfSet - sumOfArray;
}


