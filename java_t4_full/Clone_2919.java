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
    HashMap<Integer,Integer> hashmap = new HashMap<>();

    for (int num : nums){
        hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
    }
    for (int k : hashmap.keySet()){
        if (hashmap.get(k) == 1){
            return k;
        }
    }
    return -1;
}


