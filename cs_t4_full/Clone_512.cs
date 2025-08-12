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
    while (cur != baseType && cur != null) 
    { 
        cur = cur.BaseType; 
    } 
    return cur == baseType; 
} 


