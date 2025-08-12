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



 

public override bool Equals (object anyObj) {
    if (anyObj == null) return false;
    var selfType = (RuntimeType) this.GetType ();
    var comparingType = (RuntimeType) anyObj.GetType ();
    if (comparingType != selfType) return false;
    var originalObj = this;
    if (DoFastEqualityCheck (originalObj)) return AcceleratedCheck (originalObj, anyObj);
    FieldInfo [] fieldInfoCollection = selfType.GetFields (BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
    for (int index = 0; index < fieldInfoCollection.Length; index++) {
        var objA = ((RtFieldInfo) fieldInfoCollection[index]).UnsafeGetValue (originalObj);
        var objB = ((RtFieldInfo) fieldInfoCollection[index]).UnsafeGetValue (anyObj);
        if (objA == null && objB != null || !objA.Equals (objB)) return false;
    }
    return true;
}


