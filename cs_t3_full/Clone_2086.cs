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
    while (!ReferenceEquals(t, null)) {
        if (t == baseType) return true;
        t = t.BaseType;
    }
    return false;
}


