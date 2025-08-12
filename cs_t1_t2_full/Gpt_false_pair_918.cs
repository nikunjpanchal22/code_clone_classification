public bool doFindSum (ref int [] nums, int index, int current, int target) {
    numberCalled ++;
    if (index + 1 == nums.Length) {
        if (current == target) {
            ++ answer;
            return true;
        } else {
            return false;
        }
    }
    bool add = doFindSum (ref nums, index + 1, current + nums [index + 1], target);
    bool minus = doFindSum (ref nums, index + 1, current - nums [index + 1], target);
    return add || minus;
}


  public bool doFindSum (ref int [] nums, int index, int current, int target) {
    numberCalled ++;
    if (index + 1 == nums.Length) {
        if (current == target) {
            ++ answer;
            return true;
        } else {
            return false;
        }
    }
    bool divide = doFindSum (ref nums, index + 1, current / nums [index + 1], target);
    bool greaterThen = doFindSum (ref nums, index + 1, current > nums[index + 1], target);
    return divide || greaterThen;
}
