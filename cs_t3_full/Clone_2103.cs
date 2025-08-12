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



 

public override bool Equals (object objectToCompare) {
    if (objectToCompare == null) return false;
    RuntimeType objType1 = (RuntimeType) base.GetType ();
    RuntimeType objType2 = (RuntimeType) objectToCompare.GetType ();
    if (objType2 != objType1) return false;
    object mainObject = this;
    if (IsBitComparisonPossible (this)) return ExpressEqualityCheck (mainObject, objectToCompare);
    FieldInfo [] fieldCollection = objType1.GetFields (BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
    for (int i = 0; i < fieldCollection.Length; i ++) {
        object firstObject = ((RtFieldInfo) fieldCollection [i]).UnsafeGetFieldValue (mainObject);
        object secondObject = ((RtFieldInfo) fieldCollection [i]).UnsafeGetFieldValue (objectToCompare);
        if (firstObject == null ? secondObject != null : ! firstObject.Equals (secondObject)) return false;
    }
    return true;
}


