public PointF ? Intersect (LineSegment other) {
    var p = line.Intersect (other.line);
    if (p == null)
        return null;
    if (bindingRectangle.Contains (p.Value) && other.bindingRectangle.Contains (p.Value)) {
        return p;
    }
    return null;
}


 public PointF ? Intersect (LineSegment other) {
    var p = line.Intersect (other.line);
    if (p == null)
        return null;
    PointF pointF = p.Value;
    bool intersects = RectangularCheckOverlap(bindingRectangle, pointF)
        && RectangularCheckOverlap (other.bindingRectangle, pointF);
    if (intersects) {
        return p;
    }
    return null;
}


