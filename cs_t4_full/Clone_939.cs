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
    float delta = 0.00001f;
    if (a == b)
        return true;

    float abDiff = Math.Abs(a - b);
    if (abDiff < InternalEpsilon || abDiff < delta)
        return true;

    float ratio = (Math.Abs(a) + Math.Abs(b)) / abDiff;
    if (ratio < delta)
        return true;
    return false;
}


