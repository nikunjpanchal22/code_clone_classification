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


public static void main (String [] args) {
    CustomClassLoader loader = new CustomClassLoader ();
    try {
        Class < ? > c = loader.getClassByName ("sample.Sample");
        Object o = c.newInstance ();
    } catch (ClassNotFoundException e) {
        e.printStackTrace ();
    } catch (InstantiationException e) {
        e.printStackTrace ();
    } catch (IllegalAccessException e) {
        e.printStackTrace ();
    }
}
