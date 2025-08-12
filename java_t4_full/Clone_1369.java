public static String join (Object [] objects, String delimiter) {
    if (objects.length == 0) {
        return "";
    }
    int capacityGuess = (objects.length * objects [0].toString ().length ()) + ((objects.length - 1) * delimiter.length ());
    StringBuilder ret = new StringBuilder (capacityGuess);
    ret.append (objects [0]);
    for (int i = 1;
    i < objects.length; i ++) {
        ret.append (delimiter);
        ret.append (objects [i]);
    }
    return ret.toString ();
}


 public static String join (Object [] objects, String delimiter) {
    StringBuilder builder = new StringBuilder((objects.length * objects [0].toString().length()) + ((objects.length - 1) * delimiter.length()));
    for (int x = 0; x < objects.length; x++) {
        builder.append(objects[x]);
        if (x+1 < objects.length) {
            builder.append(delimiter);
        }
    }
    return builder.toString();
}


