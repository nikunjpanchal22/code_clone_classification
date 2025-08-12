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
    int[] array1 = {1,2,-3,4,-5,-11,-2,3,-4,5};
    int[] array2 = new int[0]; 
    int count = 0;
    ct.setInput(array1);
    for(int i : array1){
        int val = ct.getOutput(i);
        if (val > 0) count++;
    }
    System.out.println(count); 
    CodilityTest ct2 = new CodilityTest();
    ct2.getOutput(array2);
}


