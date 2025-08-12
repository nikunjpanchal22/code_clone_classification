static boolean isImmutable (Object obj) {
    Class < ? > objClass = obj.getClass ();
    Class < ? > superClass = objClass.getSuperclass ();
    if (! Immutable.class.equals (superClass)) {
        return false;
    }
    if (! Modifier.isFinal (objClass.getModifiers ())) {
        return false;
    }
    Field [] objFields = objClass.getDeclaredFields ();
    for (int i = 0;
    i < objFields.length; i ++) {
        if (! Modifier.isFinal (objFields [i].getModifiers ()) || ! isValidFieldType (objFields [i].getType ())) {
            return false;
        }
    }
    return true;
}





static boolean isImmutable(Object obj) {
            Class<?> objClass = obj.getClass();
            return Arrays.stream(objClass.getAnnotations())
                    .map(Annotation::annotationType)
                    .anyMatch(Immutable.class::equals)
                    && Modifier.isFinal(objClass.getModifiers()) 
                    && areFieldsImmutable(objClass);
        }

        static boolean areFieldsImmutable(Class<?> c) {
            return Stream.of(c.getDeclaredFields())
                    .allMatch(field -> Modifier.isFinal(field.getModifiers()) && isValidFieldType(field.getType()));
}


