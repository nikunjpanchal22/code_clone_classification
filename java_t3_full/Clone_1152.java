public static void main (String [] args) throws Exception {
    CodilityTest o_tc = new CodilityTest ();
    int [] x = {1, 2, - 3, 4, - 5, - 11, - 2, 3, - 4, 5};
    int [] y = new int [0];
    o_tc.setInput (x);
    o_tc.getOutput (x);
    System.out.println (count);
    CodilityTest o_tc1 = new CodilityTest ();
    o_tc1.getOutput (y);
}


 public static void main (String [] args) throws Exception{ 
    CodilityTest ct = new CodilityTest ();
    int[] arr1 = {1,2,-3,4,-5,-11,-2,3,-4,5};
    int[] arr2 = new int[0]; 
    int count = 0;
    for(int i=0; i<arr1.length; i++){
        ct.setInput(arr1[i]);
        int val = ct.getOutput(arr1[i]);
        if (val > 0) count++;
    }
    System.out.println(count);
    CodilityTest ct2 = new CodilityTest();
    ct2.getOutput(arr2);
}


