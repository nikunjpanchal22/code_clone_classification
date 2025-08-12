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
    double delta = 0.00001;
    if (Math.Abs(a-b) < delta)
        return true;
    return false;
}


