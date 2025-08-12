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
    return t.BaseType != null && (t.BaseType == baseType || t.BaseType.InheritsFrom(baseType));
}


