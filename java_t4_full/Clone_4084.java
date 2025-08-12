public int [] rotate (int [] nums, int k) {
    if (k > nums.length) k = k % nums.length;
    int [] result = new int [nums.length];
    System.arraycopy (nums, k + 1, result, 0, k);
    System.arraycopy (nums, 0, result, k + 1, nums.length - 1);
    nums = result;
    return result;
}





public int[] rotate(int[] nums, int k){
  ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
  for(int num: nums) deque.addLast(num);
  int r = k%nums.length;
  for(int i=0;i<r;i++) {
      int num = deque.removeLast();
      deque.addFirst(num);
   }
   for(int i=0;i<nums.length;i++) nums[i] = deque.pop();
   return nums;
}


