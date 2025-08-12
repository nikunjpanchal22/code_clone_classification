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
    if (baseType == null || t == null) return false;

    if (baseType == t) return true;

    return InheritsFrom(t.BaseType, baseType);
}


