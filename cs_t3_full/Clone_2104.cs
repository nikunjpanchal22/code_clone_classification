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



 

public override bool Equals (object comparisonObject) {
    if (comparisonObject == null) return false;
    RuntimeType typeSelf = (RuntimeType) GetType ();
    RuntimeType typeOther = (RuntimeType) comparisonObject.GetType ();
    if (typeOther != typeSelf) return false;
    object a = this;
    if (BitComparisonAllowed (this)) return QuickEqualityCheck (a, comparisonObject);
    FieldInfo [] FieldsInfo = typeSelf.GetFields (BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
    for (int index = 0; index < FieldsInfo.Length; index++) {
        object objectOne = ((RtFieldInfo) FieldsInfo [index]).UnsafeAccessValue (a);
        object objectTwo = ((RtFieldInfo) FieldsInfo [index]).UnsafeAccessValue (comparisonObject);
        if (objectOne == null && objectTwo != null || ! objectOne.Equals (objectTwo)) return false;
    }
    return true;
}


