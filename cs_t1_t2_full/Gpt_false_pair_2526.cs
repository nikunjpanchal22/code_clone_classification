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


 public bool Match (T left, T right) {
    
    var leftResult = expr.Invoke(left);
    var rightResult = expr.Invoke(right);
   
    if (leftResult == null && rightResult == null)
        return true;
    else if (leftResult == null || rightResult == null)
        return false;
    else
        return leftResult.Equals(rightResult);
}
