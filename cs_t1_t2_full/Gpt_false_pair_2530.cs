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


 public bool IsEqual (T left, T right) {
    
    var leftInfo = expr.Invoke(left);
    var rightInfo = expr.Invoke(right);
   
    if (leftInfo == null && rightInfo == null)
        return true;
    else if (leftInfo == null ^ rightInfo == null)
        return false;
    else
        return leftInfo.Equals(rightInfo);
}
