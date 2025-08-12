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
    float absoluteDiff = Math.Abs(a - b);

    if (a == b)
        return true;
    if (absoluteDiff < 0.00001f)
        return true;

    float relativeDiff = (float)(absoluteDiff / (Math.Abs(a) + Math.Abs(b)));
    return (relativeDiff <= 0.00001f);
}


