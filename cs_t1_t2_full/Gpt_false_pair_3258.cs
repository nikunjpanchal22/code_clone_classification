public bool ReflectiveEquals (object first, object second) {
    if (first == null && second == null) {
        return true;
    }
    if (first == null || second == null) {
        return false;
    }
    Type firstType = first.GetType ();
    if (second.GetType () != firstType) {
        return false;
    }
    foreach (PropertyInfo propertyInfo in firstType.GetProperties ()) {
        if (propertyInfo.CanRead) {
            object firstValue = propertyInfo.GetValue (first, null);
            object secondValue = propertyInfo.GetValue (second, null);
            if (! object.Equals (firstValue, secondValue)) {
                return false;
            }
        }
    }
    return true;
}


public bool ReflectiveEquals (object first, object second) {
    if (first == null && second == null) {
        return true;
    }
    if (first == null || second == null) {
        return false;
    }
    Type firstType = first.GetType ();
    if (second.GetType () != firstType) {
        return false;
    }
    foreach (MethodInfo methodInfo in firstType.GetMethods()) {
        if (!methodInfo.IsStatic) {
            object firstValue = methodInfo.Invoke(first, new Object[] {});
            object secondValue = methodInfo.Invoke(second, new Object[] {});
            if (!object.Equals(firstValue, secondValue)) {
                return false;
            }
        }
    }
    return true;
}
