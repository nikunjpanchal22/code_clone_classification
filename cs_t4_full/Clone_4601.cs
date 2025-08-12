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
    // handle corner cases where a or b is 0
    if ((a == 0.0 || b == 0.0) && Math.Abs (a - b) < InternalEpsilon )
    return true;
    else // handle remaining cases
        return Math.Abs (a - b) / (Math.Abs (a) + Math.Abs (b)) < InternalEpsilon;
}


