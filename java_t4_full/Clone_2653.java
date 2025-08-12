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



 

static void throwException(String exClassName) throws ClassNotFoundException, IllegalAccessException, InstantiationException{
    Class exClass = Class.forName(exClassName);
    Exception exception;
    if(CheckedException.class.isAssignableFrom(exClass)){
        exception = ((CheckedException)exClass.newInstance());
    }else if(UncheckedException.class.isAssignableFrom(exClass)){
        exception = ((UncheckedException)exClass.newInstance());
    }else{
         throw new ClassNotFoundException();
    }
    throw exception;
}


