public boolean haveThree (int [] nums) {
    int count = 0;
    boolean flag = false;
    for (int i = 0;
    i < nums.length; i ++) {
        if (nums [i] == 3) {
            if (flag) {
                return false;
            } else {
                count ++;
                flag = true;
            }
        } else {
            flag = false;
        }
    }
    return count == 3;
}





public boolean haveThree(int[] nums) {
    List<Integer> listNums = Arrays.stream(nums).boxed().collect(Collectors.toList());
    return Collections.frequency(listNums, 3) == 3;
}


