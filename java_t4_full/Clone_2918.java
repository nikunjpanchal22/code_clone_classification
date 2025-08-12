public static int singleNumber (int [] nums) {
    Set < Integer > unique = new HashSet < > ();
    for (int num : nums) {
        if (! unique.add (num)) {
            unique.remove (num);
        }
    }
    return unique.iterator ().next ();
}





public int singleNumber(int[] nums) {
    int len = nums.length;
    Arrays.sort(nums);
    int single = 0;
    int cnt = 0;
    for(int i=0;i<len;i++){
        single = single^nums[i];
        if(single==0){
            cnt++;
        }
    }
    return nums[cnt];
}


