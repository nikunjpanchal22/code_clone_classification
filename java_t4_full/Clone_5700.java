public int [] zeroFront (int [] nums) {
    if (nums == null) {
        return null;
    }
    int zerosPos = 0;
    for (int i = 0;
    i < nums.length; ++ i) {
        if (nums [i] == 0) {
            num [i] = num [zerosPos];
            num [zerosPos] = 0;
            ++ zerosPos;
        }
    }
    return num;
}




public int[] zeroFront(int[] nums) {
    if (nums == null) return null;
    Deque<Integer> deque = new ArrayDeque<>();
    for (int num : nums) if (num == 0) deque.addFirst(num); else deque.addLast(num);
    return deque.stream().mapToInt(i->i).toArray();
}


