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
    if (t == baseType) 
    { 
        return true; 
    } 
    Type cur = t.BaseType; 
    while (cur !=null && !cur.Equals(baseType)) 
    { 
        cur = cur.BaseType; 
    } 
    return cur != null; 
} 


