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
    // check for exact equality
    if (a == b)
        return true;
    // handle special cases 
    if (a == 0.0 || b == 0.0)
        return Math.Abs (a-b) < InternalEpsilon;
    // handle general case
    else
        return Math.Abs (a-b) / (Math.Abs (a) + Math.Abs (b)) < InternalEpsilon;
}


