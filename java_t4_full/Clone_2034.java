public static String sequenceNums (int [] nums) {
    StringBuilder sb = new StringBuilder ();
    if (nums.length == 0) return sb.toString ();
    int begin = nums [0], end = nums [0];
    for (int cur : nums) if (cur - end <= 1) end = cur;
    else {
        appendRange (sb, begin, end);
        begin = end = cur;
    }
    appendRange (sb, begin, end);
    return sb.substring (1);
}


 public static String sequenceNums (int [] nums) {
    StringBuilder sb = new StringBuilder ();
    if (nums.length == 0) return sb.toString ();
    HashSet<Integer> check = new HashSet<>();
    for (int ints : nums) {
        check.add(ints);
    }
    List<Integer> newList = new ArrayList<>(check);
    Collections.sort(newList);
    int startNum = newList.get(0);
    int endNum = newList.get(0);
    for (int i = 1; i < newList.size(); i++){
        if (newList.get(i) - endNum <= 1) {
            endNum = newList.get(i); 
        }
        else {
            appendRange (sb, startNum, endNum);
            startNum = endNum = newList.get(i);
        }
    }
    appendRange (sb, startNum, endNum);
    return sb.substring (1);
}


