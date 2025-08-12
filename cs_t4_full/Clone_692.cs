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


 public override bool Equals(object obj)
{
    if (obj == null || !(obj is RuntimeType))
        return false;

    RuntimeType type1 = (RuntimeType)base.GetType();
    RuntimeType type2 = (RuntimeType)obj.GetType();
    if (!type1.Equals(type2))
        return false;

    object a = this;
    if (CanCompareBits(this))
        return FastEqualsCheck(a, obj);

    FieldInfo[] fields1 = type1.GetFields(BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);
    FieldInfo[] fields2 = type2.GetFields(BindingFlags.NonPublic | BindingFlags.Public | BindingFlags.Instance);

    if (fields1.Length != fields2.Length)
        return false;

    for (int i = 0; i < fields1.Length; i++)
    {
        RtFieldInfo rtf1 = (RtFieldInfo)fields1[i];
        RtFieldInfo rtf2 = (RtFieldInfo)fields2[i];
        object obj1 = rtf1.UnsafeGetValue(a);
        object obj2 = rtf2.UnsafeGetValue(obj);

        if (obj1 == null && obj2 == null)
            continue;
        else if (obj1 == null || obj2 == null)
            return false;
        else if (!obj1.Equals(obj2))
            return false;
    }
    return true;
}


