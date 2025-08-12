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


public PointF ? CheckIntersect (LineEquation other) {
    if (this.isVertical && other.isVertical)
        return null;
    if (this.a == other.a)
        return null;
    if (this.isVertical)
        return other.CheckIntersect (this.xConstForVertical);
    if (other.isVertical)
        return this.CheckIntersect (other.xConstForVertical);
    var x = (this.b - other.b) / (other.a - this.a);
    return CheckIntersect (x);
}


