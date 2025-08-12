public PointF ? Intersect (LineSegment other) {
    var p = line.Intersect (other.line);
    if (p == null)
        return null;
    if (bindingRectangle.Contains (p.Value) && other.bindingRectangle.Contains (p.Value)) {
        return p;
    }
    return null;
}


 public PointF? Intersect(LineSegment other){
    PointF? intersection = line.Intersect(other.line);
    if(intersection != null && bindingRectangle.Contains(intersection.Value) && other.bindingRectangle.Contains(intersection.Value)){
        return intersection;
    }
    else{
        return null;
    }
}


