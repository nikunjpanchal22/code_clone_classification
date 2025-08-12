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


 public static void main (String [] args) {	CustomClassLoader loader = null;
	Class<?> c = null; 
	try {
	    loader = new CustomClassLoader();
	    c = loader.findClass("sample.Sample");
	    Object o = c.newInstance();
	} catch (ClassNotFoundException|InstantiationException|IllegalAccessException e) {
	    e.printStackTrace();
	}
}


