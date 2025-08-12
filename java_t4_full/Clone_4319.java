public int sum13 (int [] nums) {
    int sum = 0;
    for (int i = 0;
    i < nums.length; i ++) {
        if (nums [i] != 13) {
            sum += nums [i];
        } else {
            i ++;
        }
    }
    return sum;
}




public int sum13( int[] nums ){
    int i = 0, sum = 0;
    while( i < nums.length ){
        if( nums[i] == 13 ){
            i += 2;
        }else{
            sum += nums[i];
            i++;
        }
    }
    return sum;
}


