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
    CodilityTest testCase = new CodilityTest ();
    int [] inputArray = {1, 2, - 3, 4, - 5, - 11, - 2, 3, - 4, 5};
    int [] finalArray = new int[0];
    int count = 0;

    testCase.setInput(inputArray);
    for(int i : inputArray){
        if(testCase.getOutput(i) > 0){
            count++;
        }
    }
    System.out.println(count); 
    CodilityTest obj2 = new CodilityTest ();
    obj2.getOutput(finalArray);
}


