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
    return Arrays.stream(nums).boxed().sorted(Comparator.naturalOrder()).mapToInt(Integer::intValue).toArray();
}


