public static boolean checkZero (Object toCheck) {
    final Class < ? > numerics = new Class < ? > [] {int.class, double.class, float.class, long.class, short.class, byte.class, Integer.class, Double.class, Float.class, Long.class, Short.class, Byte.class};
    try {
        Class < ? > clazz = toCheck.getClass ();
        Field [] fields = clazz.getDeclaredFields ();
        for (Field field : fields) {
            Class < ? > type = field.getType ();
            boolean isNumeric = false;
            for (Class < ? > numeric : numerics) {
                if (type.equals (numeric)) {
                    isNumeric = true;
                    break;
                }
            }
            if (isNumeric) {
                Object value = field.get (toCheck);
                if (value == 0) {
                    return true;
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace ();
    }
    return false;
}


 public static boolean checkZero (Object toCheck) {
    final Class < ? > numerics = new Class < ? > [] {int.class, double.class, float.class, long.class, short.class, byte.class, Integer.class, Double.class, Float.class, Long.class, Short.class, Byte.class};
    try {
        Class < ? > clazz = toCheck.getClass ();
        Field [] fields = clazz.getDeclaredFields ();
        for (Field field : fields) {
            boolean isNumeric = false;
            for (Class < ? > numeric : numerics) {
                if (field.getType().equals(numeric)) {
                    isNumeric = true;
                }
            }
            if (isNumeric) {
                Object value = field.get (toCheck);
                if (value != null && value instanceof Number && ((Number)value).doubleValue() == 0.0d) {
                    return true;
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace ();
    }
    return false;
}
