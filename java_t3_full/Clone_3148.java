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
            java.io.File file = new java.io.File("output.txt");
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            output.println("arg = " + fakeConstructorArg);
            output.close();
        }
    };
}


