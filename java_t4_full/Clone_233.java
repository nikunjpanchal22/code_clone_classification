public static int singleNumber (int [] nums) {
    Set < Integer > unique = new HashSet < > ();
    for (int num : nums) {
        if (! unique.add (num)) {
            unique.remove (num);
        }
    }
    return unique.iterator ().next ();
}


 public static int singleNumber (int[] nums) { 
    int result = 0;
    for (int num : nums) {
        result ^= num;
    }
    return result; 
}


