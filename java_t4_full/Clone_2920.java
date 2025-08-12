public static int singleNumber (int [] nums) {
    Set < Integer > unique = new HashSet < > ();
    for (int num : nums) {
        if (! unique.add (num)) {
            unique.remove (num);
        }
    }
    return unique.iterator ().next ();
}




import java.util.Arrays;

public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i = 0; i< nums.length-1; i+=2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[i];
    }
}


