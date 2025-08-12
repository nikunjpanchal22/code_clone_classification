public bool Equals (T left, T right) {
    var leftProp = expr.Invoke (left);
    var rightProp = expr.Invoke (right);
    if (leftProp == null && rightProp == null)
        return true;
    else if (leftProp == null ^ rightProp == null)
        return false;
    else
        return leftProp.Equals (rightProp);
}


public bool Equals (T left, T right) {
    var leftField = expr.Field (left);
    var rightField = expr.Field (right);
    if (leftField == null && rightField == null)
        return true;
    else if (leftField == null ^ rightField == null)
        return false;
    else
        return leftField.Equals (rightField);
}
