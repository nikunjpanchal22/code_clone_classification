static void throwException (final String exClassName) throws CheckedException, UncheckedException {
    Class < ? > clazz;
    try {
        clazz = Class.forName (exClassName);
    } catch (ClassNotFoundException cnfe) {
        throw new InternalError (exClassName, cnfe);
    }
    if (CheckedException.class.isAssignableFrom (clazz)) {
        throw newException (clazz.asSubclass (CheckedException.class));
    } else if (UncheckedException.class.isAssignableFrom (clazz)) {
        throw newException (clazz.asSubclass (UncheckedException.class));
    } else {
        throw new InternalError (exClassName + " is not a valid exception");
    }
}


 

public static void throwException(String className) 
throws ClassNotFoundException, 
       IllegalAccessException, 
       InstantiationException 
{
    Class<?> clazz = Class.forName(className);
    if (clazz.equals(CheckedException.class)) {
        throw (CheckedException) clazz.newInstance();
    } else if (clazz.equals(UncheckedException.class)) {
        throw (UncheckedException) clazz.newInstance();
    } else {
        throw new RuntimeException("Not a valid Exception type");
    }
}


