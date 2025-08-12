public override bool Equals (float a, float b) {
    float absoluteA = Math.Abs (a);
    float absoluteB = Math.Abs (b);
    float absoluteDifference = Math.Abs (a - b);
    if (a == b) {
        return true;
    } else if (a == 0 || b == 0 || absoluteDifference < InternalEpsilon) {
        return absoluteDifference < InternalEpsilon;
    } else {
        return absoluteDifference / (absoluteA + absoluteB) < InternalEpsilon;
    }
    return true;
}


 public override bool Equals (float a, float b) {
    double diff = Math.Abs (a - b);
    if (diff <= InternalEpsilon)
        return true;
    else if (a == 0 || b == 0 || diff < InternalEpsilon) 
        return diff < InternalEpsilon;
    else
        return diff / (Math.Abs (a) + Math.Abs (b)) < InternalEpsilon;
}


