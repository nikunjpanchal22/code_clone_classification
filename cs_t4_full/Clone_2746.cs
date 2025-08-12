public override bool Equals (object obj) {
    if (obj == null) {
        return false;
    }
    RuntimeType type = (RuntimeType) base.GetType ();
    RuntimeType type2 = (RuntimeType) obj.GetType ();
    if (type2 != type) {
        return false;
    }
    object a = this;
    if (CanCompareBits (this)) {
        return FastEqualsCheck (a, obj);
    }
    FieldInfo [] fields = type.GetFields (BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
    for (int i = 0; i < fields.Length; i ++) {
        object obj3 = ((RtFieldInfo) fields [i]).UnsafeGetValue (a);
        object obj4 = ((RtFieldInfo) fields [i]).UnsafeGetValue (obj);
        if (obj3 == null) {
            if (obj4 != null) {
                return false;
            }
        } else if (! obj3.Equals (obj4)) {
            return false;
        }
    }
    return true;
}



 

public override bool Equals (object compareTo) {
    if (compareTo == null) return false;
    var selfRT = (RuntimeType)GetType ();
    var otherRT = (RuntimeType)compareTo.GetType ();
    if (otherRT != selfRT) return false;
    var thisObj = this;
    if (CanPerformFastEqualCheck (thisObj)) return FastEqualChecker (thisObj, compareTo);
    var allFields = selfRT.GetFields (BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
    for (int i = 0; i < allFields.Length; i++) {
        var primaryObj = ((RtFieldInfo)allFields[i]).UnsafeGetValueUnchecked (thisObj);
        var secondaryObj = ((RtFieldInfo)allFields[i]).UnsafeGetValueUnchecked (compareTo);
        if (primaryObj == null ? secondaryObj != null : !primaryObj.Equals (secondaryObj)) return false;
    }
    return true;
}


