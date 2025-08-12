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
    if (nums == null || nums.length == 0) return sb.toString ();
    int begin = nums [0], end = nums [0];
    Stack<Integer> myStack = new Stack<>();
    myStack.push(nums[0]);
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] - end <= 1) {
            end = nums[i];
            myStack.push(nums[i]);
        } else {
            appendRangeOfStack(sb, myStack);
            begin = end = nums[i];
            myStack.clear();
            myStack.push(nums[i]);
        }
    }
    appendRangeOfStack(sb, myStack);
    return sb.substring (1);
}


