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
    if (isHorizontal && other.isHorizontal)
        return null;
    if (a == other.a)
        return null;
    if (isHorizontal)
        return other.Intersect (yConstForHorizontal);
    if (other.isHorizontal)
        return Intersect (other.yConstForHorizontal);
    var x = (b - other.b) / (other.a - a);
    return Intersect (x);
}
