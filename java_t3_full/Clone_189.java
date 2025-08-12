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
	Class <?> exceptionClass;
	try {
		exceptionClass = Class.forName(className);
	}
	catch (ClassNotFoundException e) {
		throw new IllegalArgumentException(e);
	}
	
	if (CheckedException.class.isAssignableFrom(exceptionClass)) {
		Constructor <? extends CheckedException> exceptionConstructor = exceptionClass.asSubclass(CheckedException.class).getConstructor();
		throw exceptionConstructor.newInstance();
	}
	else if (UncheckedException.class.isAssignableFrom(exceptionClass)) {
		Constructor <? extends UncheckedException> exceptionConstructor = exceptionClass.asSubclass(UncheckedException.class).getConstructor();
		throw exceptionConstructor.newInstance();
	}
	else {
		throw new IllegalArgumentException("Not a valid exception type: " + className);
	}
}


