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



 

public override bool Equals (object comparisonItem) {
    if (comparisonItem == null) return false;
    var typeA = (RuntimeType) base.GetType ();
    var typeB = (RuntimeType) comparisonItem.GetType ();
    if (typeB != typeA) return false;
    var self = this;
    if (CanCompareBits (self)) return QuickEqualsCheck (self, comparisonItem);
    var fieldData = typeA.GetFields (BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
    for (int count = 0; count < fieldData.Length; count++) {
        var Object1 = ((RtFieldInfo) fieldData[count]).UnsafeGetValue (self);
        var Object2 = ((RtFieldInfo) fieldData[count]).UnsafeGetValue (comparisonItem);
        if (Object1 == null ? Object2 != null : !Object1.Equals (Object2)) return false;
    }
    return true;
}


