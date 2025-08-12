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
    var leftData = expr.Invoke (left);
    var rightData = expr.Invoke (right);
    
    if (leftData == null && rightData == null)
        return true;
    else if (leftData == null ^ rightData == null)
        return false;
    else
        return Object.Equals (leftData, rightData);
}
