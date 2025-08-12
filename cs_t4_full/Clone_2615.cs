public static bool InheritsFrom (this Type t, Type baseType) {
    Type cur = t.BaseType;
    while (cur != null) {
        if (cur.Equals (baseType)) {
            return true;
        }
        cur = cur.BaseType;
    }
    return false;
}





public static bool InheritsFrom(this Type t, Type baseType) {
    do {
        if (t.BaseType == baseType)
            return true;
        t = t.BaseType;
    } while (t != null);
     
    return false;
}


