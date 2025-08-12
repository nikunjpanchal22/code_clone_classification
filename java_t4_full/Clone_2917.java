public static int singleNumber (int [] nums) {
    Set < Integer > unique = new HashSet < > ();
    for (int num : nums) {
        if (! unique.add (num)) {
            unique.remove (num);
        }
    }
    return unique.iterator ().next ();
}




public static int singleNumber (int [] nums) {
    Set<Integer> set = new LinkedHashSet<>();
    int sumOfUnique = 0;
    int sumOfNums = 0;

    for(int num: nums){
        if(!set.contains(num)){
            set.add(num);
            sumOfUnique += num;
        }
        sumOfNums += num;
    }
    int singleNum = 2*sumOfUnique - sumOfNums;
    return singleNum;
}


