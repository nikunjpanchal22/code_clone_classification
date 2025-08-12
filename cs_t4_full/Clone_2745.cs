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



 

public override bool Equals (object other) {
    if (other == null) return false;
    var type1 = (RuntimeType) GetType ();
    var type2 = (RuntimeType) other.GetType ();
    if (type2 != type1) return false;
    var currentInstance = this;
    if (IsFastComparisonPossible (currentInstance)) return QuickEqualityCheck (currentInstance, other);
    var fieldsInfo = type1.GetFields (BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
    for (int i = 0; i < fieldsInfo.Length; i++) {
        var objectOne = ((RtFieldInfo) fieldsInfo[i]).UnsafeGetValue (currentInstance);
        var objectTwo = ((RtFieldInfo) fieldsInfo[i]).UnsafeGetValue (other);
        if (objectOne == null && objectTwo != null || !objectOne.Equals (objectTwo)) return false;
    }
    return true;
}


