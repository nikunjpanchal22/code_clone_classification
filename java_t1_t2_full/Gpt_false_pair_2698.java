public static void main (final String [] argv) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    final String methodName;
    final Method method;
    final Main main;
    main = new Main ();
    if (argv.length == 0) {
        methodName = "foo";
    } else {
        methodName = "bar";
    }
    method = Main.class.getDeclaredMethod (methodName, int.class);
    main.car (method, 42);
}


 public static void main (final String [] argv) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    final String methodName;
    final Method method;
    final Main main;
    main = new Main ();
    if (argv.length == 0) {
        methodName = "foo";
    } else {
        methodName = "bar";
    }
    Class[] paramString = {int.class};
    method = Main.class.getDeclaredMethod (methodName, paramString);
    main.car (method, 42);
}
