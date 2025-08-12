public static bool IsInPolygon (Point [] poly, Point p) {
    Point p1, p2;
    bool inside = false;
    if (poly.Length < 3) {
        return inside;
    }
    var oldPoint = new Point (poly [poly.Length - 1].X, poly [poly.Length - 1].Y);
    for (int i = 0; i < poly.Length; i ++) {
        var newPoint = new Point (poly [i].X, poly [i].Y);
        if (newPoint.X > oldPoint.X) {
            p1 = oldPoint;
            p2 = newPoint;
        } else {
            p1 = newPoint;
            p2 = oldPoint;
        }
        if ((newPoint.X < p.X) == (p.X <= oldPoint.X) && (p.Y - (long) p1.Y) * (p2.X - p1.X) < (p2.Y - (long) p1.Y) * (p.X - p1.X)) {
            inside = ! inside;
        }
        oldPoint = newPoint;
    }
    return inside;
}


  public static bool IsInPolygon (Point [] poly, Point p) {
    if (poly.Length < 3) {
        return false;
    }
    
    bool isInside = false;
    for(int i = 0; i < poly.Length; i++) {
        int nextInd = (i+1) % poly.Length;
        if(doIntersect(poly[i], poly[nextInd], p, new Point(poly.Length-1))) {
            isInside = !isInside;
        }
    }

    return isInside;
}


