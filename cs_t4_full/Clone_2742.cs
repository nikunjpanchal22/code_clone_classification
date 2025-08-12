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



 

public override bool Equals (object anyObject) {
    if (anyObject == null) return false;
    RuntimeType ourType = this.GetType () as RuntimeType;
    RuntimeType compareType = anyObject.GetType () as RuntimeType;
    if (!compareType.Equals (ourType)) return false;
    var originalObject = this;
    var isFastPossible = originalObject is IComparable;
    if (isFastPossible) return QuickEqualsTest (originalObject, anyObject);
    var privateAndPublicInstanceFields = ourType.GetFields (BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
    for (var i = 0; i < privateAndPublicInstanceFields.Length; i++) {
        var obj1 = (RtFieldInfo)privateAndPublicInstanceFields[i].GetValue (originalObject);
        var obj2 = (RtFieldInfo)privateAndPublicInstanceFields[i].GetValue (anyObject);
        if ((obj1 == null && obj2 != null) || (obj1 != null && !obj1.Equals (obj2))) return false;
    }
    return true;
}


