public static void main (String [] args) throws Exception {
    final int fakeConstructorArg = 10;
    Object a = new Object () {
        {
            System.out.println ("arg = " + fakeConstructorArg);
        }
    }
    ;
}



 

public static void main (String [] args) throws Exception {
    final int fakeConstructorArg = 10;
    Object a = new Object () {
        {
            PrintStream fileStream = new PrintStream("Output.txt");
            PrintStream originalOut = System.out; 
            System.setOut(fileStream);
            System.out.println("arg = " + fakeConstructorArg); 
            System.setOut(originalOut); 
        }
    };
}


