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
    for (Type type = t; type != null; type = type.BaseType) {
        if (type == baseType) {
            return true;
        }
    }
    return false;
}


