public static int singleNumber (int [] nums) {
    Set < Integer > unique = new HashSet < > ();
    for (int num : nums) {
        if (! unique.add (num)) {
            unique.remove (num);
        }
    }
    return unique.iterator ().next ();
}


 public static int singleNumber (int[] nums){
  Map<Integer, Integer> unique = new HashMap<>();
  for (int num : nums){
     if (unique.containsKey(num))
       unique.remove (num);
     else
       unique.put (num, 1);
   }
  return unique.keySet().iterator().next();
}


