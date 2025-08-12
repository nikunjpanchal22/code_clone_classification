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


 public PointF? Intersect(LineEquation other) 
{ 
    if (isVertical == other.isVertical || a == other.a)  
        return null; 
  
    if (isVertical) 
        other.Intersect(xConstForVertical); 
    else if (other.isVertical) 
        Intersect(other.xConstForVertical); 
    else 
    {
        double x = (b-other.b)/(other.a-a);
        return new PointF((float)x, (float) (a * x + b));
    }
  
    return null; 
}


