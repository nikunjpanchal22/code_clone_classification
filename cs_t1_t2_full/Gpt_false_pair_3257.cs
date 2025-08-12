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


public bool ReflectiveEquals (object left, object right) {
    // Added return true if both references are null
    if (left == null && right == null) { 
        return true;
    }
    // Added return false if only one object ||  both objects are null
    if (left == null || second == null) {
        return false;
    }
    Type leftType = left.GetType ();
    //Compared the type of both objects
    if (right.GetType () != leftType) {
        return false;
    }
    // Iterate through left object properties
    foreach (PropertyInfo propertyInfo in leftType.GetProperties ()) {
        //Check if Can Read
        if (propertyInfo.CanRead) {
            object leftValue = propertyInfo.GetValue (first, null);
            object rightValue = propertyInfo.GetValue (second, null);
            //Compared property values
            if (! object.Equals (leftValue, rightValue)) {
                return false;
            }
        }
    }
    return true;
}
