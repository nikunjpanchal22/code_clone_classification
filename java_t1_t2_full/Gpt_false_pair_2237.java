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
    Long a = new Long () {
        {
            System.out.println ("arg = " + fakeConstructorArg);
        }
    }
    ;
}
