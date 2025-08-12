public int [] rotate (int [] nums, int k) {
    if (k > nums.length) k = k % nums.length;
    int [] result = new int [nums.length];
    System.arraycopy (nums, k + 1, result, 0, k);
    System.arraycopy (nums, 0, result, k + 1, nums.length - 1);
    nums = result;
    return result;
}


public int [] rotate (int [] nums, int pivot) {
    if (pivot > nums.length) pivot = pivot % nums.length;
    int [] result = new int [nums.length];
    System.arraycopy (nums, pivot + 1, result, 0, pivot);
    System.arraycopy (nums, 0, result, pivot + 1, nums.length - 1);
    nums = result;
    return result;
}
