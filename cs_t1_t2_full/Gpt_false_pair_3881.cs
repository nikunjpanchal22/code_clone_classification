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


public static bool CheckForInheritance (Type t, Type baseType) {
    Type current = t.BaseType;
    while (current != null) {
        if (current.Equals (baseType)) {
            return true;
        }
        current = current.BaseType;
    }
    return false;
}
