public static void throwException (String className) throws CheckedException, UncheckedException {
    Class < ? > exceptionClass;
    try {
        exceptionClass = Class.forName (className);
    } catch (ClassNotFoundException e) {
        throw new IllegalArgumentException (e);
    }
    try {
        if (CheckedException.class.isAssignableFrom (exceptionClass)) {
            throw exceptionClass.asSubclass (CheckedException.class).newInstance ();
        } else if (UncheckedException.class.isAssignableFrom (exceptionClass)) {
            throw exceptionClass.asSubclass (UncheckedException.class).newInstance ();
        } else {
            throw new IllegalArgumentException ("Not a valid exception type: " + exceptionClass.getName ());
        }
    } catch (InstantiationException | IllegalAccessException e) {
        throw new IllegalStateException (e);
    }
}






public static void throwException(String className) throws Exception {
    try {
        Class<?> clazz = Class.forName(className);
        Object ex = clazz.newInstance();
        if (ex instanceof RuntimeException) {
            throw (RuntimeException) ex;
        } else if (ex instanceof Exception) {
            throw (Exception) ex;
        }
    } catch (Exception e) {
        throw e;
    }
}


