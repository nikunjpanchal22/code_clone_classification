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


 public bool IsEqualTo (T left, T right) {
    
    var leftValue = expr.Invoke(left);
    var rightValue = expr.Invoke(right);
   
    if (leftValue == null && rightValue == null)
        return true;
    else if (leftValue == null || rightValue == null)
        return false;
    else
        return leftValue.Equals(rightValue);
}
