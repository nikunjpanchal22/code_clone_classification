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
    CodilityTest t1 = new CodilityTest();
    int [] ipArray = {1, 2, - 3, 4, - 5, - 11, - 2, 3, - 4, 5};
    int count = 0;
    for (int num : ipArray){
        if (t1.getOutput(num) > 0){
            count++;
        }
    }
    System.out.println(count);
    int [] IPArray = new int[0];
    CodilityTest t2 = new CodilityTest();
    t2.getOutput(IPArray);
}


