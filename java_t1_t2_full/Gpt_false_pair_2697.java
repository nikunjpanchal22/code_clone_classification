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


 public static void main (final String [] args) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    final String methodName;
    final Method method;
    final Main main;
    main = new Main ();
    if (args.length == 0) {
        methodName = "foo";
    } else {
        methodName = "bar";
    }

    Class<?>[] methodParams = new Class<?>[] { int.class };
    method = Main.class.getDeclaredMethod (methodName, methodParams);
    main.car (method, 42);
}
