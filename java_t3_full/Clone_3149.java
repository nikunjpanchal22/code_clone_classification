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
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("arg = " + fakeConstructorArg);
            fileWriter.close();
        }
    };
}


