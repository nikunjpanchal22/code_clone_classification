public PointF ? Intersect (LineSegment other) {
    var p = line.Intersect (other.line);
    if (p == null)
        return null;
    if (bindingRectangle.Contains (p.Value) && other.bindingRectangle.Contains (p.Value)) {
        return p;
    }
    return null;
}


 public PointF? Intersect(LineSegment other) {
    PointF? result = null;
    var p = line.Intersect(other.line);
    if ((p != null) && (bindingRectangle.Contains(p.Value) && other.bindingRectangle.Contains(p.Value))) {
        result = p;
    }
    return result;
}


