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


 public bool CompareValues (T left, T right) {
    var leftVal = expr.Invoke (left);
    var rightVal = expr.Invoke (right);
    
    if (leftVal == null && rightVal == null)
        return true;
    else if (leftVal == null ^ rightVal == null)
        return false;
    else
        return leftVal.Equals (rightVal);
}
