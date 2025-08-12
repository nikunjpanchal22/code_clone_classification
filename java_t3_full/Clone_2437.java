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
    List<Integer> no_duplicate_list = new ArrayList<>();

    for (int i : nums) {
        if (!no_duplicate_list.contains(i)){
            no_duplicate_list.add(i);
        } else {
            no_duplicate_list.remove(new Integer(i));
        }
    }
    return no_duplicate_list.get(0);
}


