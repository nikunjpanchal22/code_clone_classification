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


 

static void throwException(String exClassName) throws Exception {
    Class clazz = Class.forName(exClassName);
    Object obj = clazz.newInstance();
    if(obj instanceof CheckedException){
        throw (CheckedException) obj;
    }else if(obj instanceof UncheckedException){
        throw (UncheckedException) obj;
    }else{
         throw new IllegalArgumentException();
    }
}


