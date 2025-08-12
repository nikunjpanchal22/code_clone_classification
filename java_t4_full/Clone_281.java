public static void main (String [] args) {
    long throwCatchTime = 0, newExceptionTime = 0, newObjectTime = 0, noStackExceptionTime = 0;
    for (int i = 0;
    i < 30; i ++) {
        throwCatchTime += throwCatchLoop ();
        newExceptionTime += newExceptionLoop ();
        newObjectTime += newObjectLoop ();
        noStackExceptionTime += newNoStackExceptionLoop ();
    }
    System.out.println ("throwCatchTime = " + throwCatchTime / 30);
    System.out.println ("newExceptionTime = " + newExceptionTime / 30);
    System.out.println ("newStringTime = " + newObjectTime / 30);
    System.out.println ("noStackExceptionTime = " + noStackExceptionTime / 30);
}


	public static void main (String [] args) {
    long throwCatchTime = 0, newExceptionTime = 0, newObjectTime = 0, noStackExceptionTime = 0;
    int counter = 0;
    try
    {
    while (counter < 30)
    {
        try{
            throwCatchTime += throwCatchLoop ();
        } catch (Exception e){
            e.printStackTrace();
            break;
        }
        try {
            newExceptionTime += newExceptionLoop ();
        } catch (Exception e){
            e.printStackTrace();
            break;
        }
        try {
            newObjectTime += newObjectLoop ();
        } catch (Exception e){
            e.printStackTrace();
            break;
        }
        try {
            noStackExceptionTime += newNoStackExceptionLoop ();
        } catch (Exception e){
            e.printStackTrace();
            break;
        }
        counter++;
    }
    }
   	catch (Exception e)
   	{
     	e.printStackTrace();
   	}
    System.out.println ("throwCatchTime = " + throwCatchTime/30);
    System.out.println ("newExceptionTime = " + newExceptionTime/30);
    System.out.println ("newStringTime = " + newObjectTime/30);
    System.out.println ("noStackExceptionTime = " + noStackExceptionTime/30);
}


