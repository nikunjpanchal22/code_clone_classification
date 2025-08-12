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
    var leftProp = expr.Property (left);
    var rightProp = expr.Property (right);
    if (leftProp == null && rightProp == null)
        return true;
    else if (leftProp == null ^ rightProp == null)
        return false;
    else
        return leftProp.Equals (rightProp);
}
