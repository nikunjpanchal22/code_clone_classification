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



 

public override bool Equals (object obj) {
    if (obj == null) return false;
    RuntimeType selfType = (RuntimeType) this.GetType ();
    RuntimeType otherType = (RuntimeType) obj.GetType ();
    if (otherType != selfType) return false;
    object selfObj = this;
    if (CouldCompareBits (this)) return FastBitEqualityCheck (selfObj, obj);
    FieldInfo [] allFields = selfType.GetFields (BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
    for (int i = 0; i < allFields.Length; i++) {
        object selfField = ((RtFieldInfo) allFields [i]).UnsafeAccessValue (selfObj);
        object otherField = ((RtFieldInfo) allFields [i]).UnsafeAccessValue (obj);
        if (selfField == null ? otherField != null : ! selfField.Equals (otherField)) return false;
    }
    return true;
}


