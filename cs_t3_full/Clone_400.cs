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
    bool intersects = RectangleContainsPoint (bindingRectangle, p.Value) 
        && RectangleContainsPoint (other.bindingRectangle, p.Value);
    if (intersects) {
        return p;
    }
    return null;
}


