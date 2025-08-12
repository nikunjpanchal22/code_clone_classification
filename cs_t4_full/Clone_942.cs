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
    float epsilon = 0.00001f;
    if (a == b) {
        return true;
    } else if ( a == 0f || b == 0f || Math.Abs(a-b) < epsilon ) {
        return Math.Abs(a-b) < epsilon;
    } else {
        return Math.Abs(a-b) / (Math.Abs(a) + Math.Abs(b)) < epsilon;
    }
    return true;
}


