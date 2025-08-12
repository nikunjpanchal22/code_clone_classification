public static int singleNumber (int [] nums) {
    int answer = 0;
    ArrayList al = new ArrayList ();
    for (int i = 0;
    i < nums.length; i ++) {
        al.add (nums [i]);
    }
    for (int i = 0;
    i < nums.length; i ++) {
        int test = nums [i];
        if (al.indexOf (test) == al.lastIndexOf (test)) {
            answer = nums [i];
        }
    }
    return answer;
}





public static int singleNumber(int[] nums) {
    int answer = 0;
    java.util.HashMap<Integer,Integer> map = new java.util.HashMap<>();
    for(int i=0; i<nums.length; i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],2);
        } else {
            map.put(nums[i],1);
        }
    }
    for(Integer i : map.keySet()){
        if(map.get(i) == 1){
            answer = i;
        }
    }
    return answer;
}


