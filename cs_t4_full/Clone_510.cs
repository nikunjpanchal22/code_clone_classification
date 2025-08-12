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


 public static bool InheritsFrom(this Type t, Type baseType) 
{ 
    Type cur = t;
    if (cur == baseType) 
    { 
        return true; 
    } 
    while (cur != null) 
    { 
        cur = cur.BaseType; 
        if (cur.Equals(baseType)) 
            return true; 
    } 
    return false; 
}


