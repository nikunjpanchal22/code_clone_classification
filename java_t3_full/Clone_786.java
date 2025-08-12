public static void main (String [] args) {
    CustomClassLoader loader = new CustomClassLoader ();
    try {
        Class < ? > c = loader.findClass ("sample.Sample");
        Object o = c.newInstance ();
    } catch (ClassNotFoundException e) {
        e.printStackTrace ();
    } catch (InstantiationException e) {
        e.printStackTrace ();
    } catch (IllegalAccessException e) {
        e.printStackTrace ();
    }
}


 public static void main (String [] args) {	try {
	    CustomClassLoader loader = new CustomClassLoader();
	    Class<?> c = loader.findClass("sample.Sample");
	    Object o = c.newInstance();
	} catch (ClassNotFoundException e) {
	    System.out.println("Class was not found");
	    e.printStackTrace();
	} catch (InstantiationException e) {
	    System.out.println("Class could not be instantiated");
	    e.printStackTrace();
	} catch (IllegalAccessException e) {
	    System.out.println("Illegal access to class or it's members");
	    e.printStackTrace();
	}
}


