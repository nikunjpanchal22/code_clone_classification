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
  List<Integer> unique = new ArrayList<>();
  for (int num : nums){
     if ( unique.contains(num))
        unique.remove(num);
     else
        unique.add (num);
   }
  return unique.iterator().next();
}


