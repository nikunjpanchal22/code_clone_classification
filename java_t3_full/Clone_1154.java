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


public static void main (String [] args) throws Exception { 
    CodilityTest obj = new CodilityTest ();
    int [] arr1 = {1, 2, - 3, 4, - 5, - 11, - 2, 3, - 4, 5};
    int count = 0;
    for (int i = 0; i < arr1.length; i++) {
        int val = obj.getOutput (arr1[i]); 
        if (val>0) count++;
    }
    System.out.println (count);
    int [] arr2 = new int [0];
    CodilityTest obj1 = new CodilityTest ();
    obj1.getOutput (arr2);
}


