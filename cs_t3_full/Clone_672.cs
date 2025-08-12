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


 public bool EqualProperties (object first, object second) {
    if (first == null && second == null) {
        return true;
    }
    if (first == null || second == null) {
        return false;
    }
    Type firstType = first.GetType ();
    Type secondType = second.GetType ();
    if (secondType != firstType) {
        return false;
    }
    foreach (PropertyInfo propertyInfo in firstType.GetProperties ()) {
        if (propertyInfo.CanRead) {
            dynamic firstValue = propertyInfo.GetValue (first, null);
            dynamic secondValue = propertyInfo.GetValue (second, null);
            if (! object.Equals (firstValue, secondValue)) {
                return false;
            }
        }
    }
    return true;
}


