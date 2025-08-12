public PointF ? Intersect (LineEquation other) {
    if (isVertical && other.isVertical)
        return null;
    if (a == other.a)
        return null;
    if (isVertical)
        return other.Intersect (xConstForVertical);
    if (other.isVertical)
        return Intersect (other.xConstForVertical);
    var x = (b - other.b) / (other.a - a);
    return Intersect (x);
}


public PointF? Intersect (LineEquation other) {
    if (isParallel && other.isParallel)
        return null;
    if (a == other.a)
        return null;
    if (isParallel)
        return other.Intersect (slopeConstForParallel);
    if (other.isParallel)
        return Intersect (other.slopeConstForParallel);
    var x = (b - other.b) / (other.a - a);
    return Intersect (x);
}
