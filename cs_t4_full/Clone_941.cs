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
    if (a == b)
        return true;

    float abDiff = Math.Abs(a - b);
    if (abDiff < InternalEpsilon)
        return true;

    float ratio = abDiff / (Math.Abs(a) + Math.Abs(b));
    if (ratio < InternalEpsilon)
        return true;
    return false;
}


