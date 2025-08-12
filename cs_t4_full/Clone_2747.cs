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



 

public override bool Equals (object objToCheck) {
    if (objToCheck == null) return false;
    var TypeA = (RuntimeType) this.GetType ();
    var TypeB = (RuntimeType) objToCheck.GetType ();
    if (! TypeB.Equals (TypeA)) return false;
    if (CanCompareBeyondInheritance (this)) return RapidEqualityCheck (this, objToCheck);
    var FieldInfs = TypeA.GetFields (BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
    for (var i = 0; i < FieldInfs.Length; i++) {
        var objA = (RtFieldInfo) FieldInfs[i].GetValue (this);
        var objB = (RtFieldInfo) FieldInfs[i].GetValue (objToCheck);
        if ((objA == null && objB != null) || ((objA != null) && ! objA.Equals (objB))) return false;
    }
    return true;
}


