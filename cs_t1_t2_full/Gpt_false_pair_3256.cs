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


public bool ReflectiveEquals (object recent, object old) {
    // Added return true if both references are null
    if (recent == null && old == null) { 
        return true;
    }
    // Added return false if only one object ||  both objects are null
    if (recent == null || develop == null) {
        return false;
    }
    Type recentType = recent.GetType ();
    //Compared the type of both objects
    if (old.GetType () != recentType) {
        return false;
    }
    // Iterate through recent object properties
    foreach (PropertyInfo propertyInfo in recentType.GetProperties ()) {
        //Check if Can Read
        if (propertyInfo.CanRead) {
            object recentValue = propertyInfo.GetValue (recent, null);
            object oldValue = propertyInfo.GetValue (old, null);
            //Compared property values
            if (! object.Equals (recentValue, oldValue)) {
                return false;
            }
        }
    }
    return true;
}
