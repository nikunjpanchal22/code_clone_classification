public int [] rotate (int [] nums, int k) {
    if (k > nums.length) k = k % nums.length;
    int [] result = new int [nums.length];
    System.arraycopy (nums, k + 1, result, 0, k);
    System.arraycopy (nums, 0, result, k + 1, nums.length - 1);
    nums = result;
    return result;
}


public int [] rotate (int [] array, int position) {
    if (position > array.length) position = position % array.length;
    int [] result = new int [array.length];
    System.arraycopy (array, position + 1, result, 0, position);
    System.arraycopy (array, 0, result, position + 1, array.length - 1);
    array = result;
    return result;
}
