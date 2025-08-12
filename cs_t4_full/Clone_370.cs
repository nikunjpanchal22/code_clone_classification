public PointF ? Intersect (LineSegment other) {
    var p = line.Intersect (other.line);
    if (p == null)
        return null;
    if (bindingRectangle.Contains (p.Value) && other.bindingRectangle.Contains (p.Value)) {
        return p;
    }
    return null;
}


  public PointF? Intersect (LineSegment other)
{
    PointF? intPoint =  line.Intersect (other.line);
    if (intPoint.HasValue &&
        bindingRectangle.Contains(intPoint.Value) && other.bindingRectangle.Contains(intPoint.Value))
        if (bindingRectangle.IntersectsWith(other.bindingRectangle))
            return intPoint;
    return null;
}


