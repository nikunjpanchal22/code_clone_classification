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


public static void main (final String [] arguments) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    final String nameOfMethod;
    final Method saidMethod;
    final Main mainObject;
    mainObject = new Main ();
    if (arguments.length == 0) {
        nameOfMethod = "foo";
    } else {
        nameOfMethod = "bar";
    }
    saidMethod = Main.class.getDeclaredMethod (nameOfMethod, int.class);
    mainObject.car (saidMethod, 42);
}
