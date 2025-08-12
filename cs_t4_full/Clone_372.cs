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
    if (isVertical && other.isVertical)
        return null;
    else if (a == other.a)
        return null;
    else if (isVertical || other.isVertical) {
        double x;
        if (isVertical)
            x = xConstForVertical;
        else 
            x = other.xConstForVertical;
        return Intersect(x);
    } 
    else {
        double x = (b - other.b) / (other.a - a);
        return Intersect(x);
    }
}


