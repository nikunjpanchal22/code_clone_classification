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
    if (isVertical && other.isVertical || a == other.a) {
        return null;
    }
                        
    double x;
    if (isVertical) {
        x = xConstForVertical;
    } else if (other.isVertical) {
        x = other.xConstForVertical;
    } else {
        x = (b - other.b) / (other.a - a);
    }
  
    return Intersect(x);
}


