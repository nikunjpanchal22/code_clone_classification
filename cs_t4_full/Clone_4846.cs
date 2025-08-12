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


 public static bool IsInPolygon(Point[] poly, Point p){
    int crossings = 0;
    int n = poly.Length;
    Point point = p;
    Point extreme = new Point(point.X, point.Y);

    for (int i = 0; i < n; i++)
    {
        Point prev = poly[i];
        Point next = poly[(i + 1) % n];

        // Check if the line segment from `prev` to `next` intersects 
        // the line segment from `point` to `extremep

        if (CalculateCrossing(prev, next, point, extreme))
            crossings++;
    }

    // If the number of crossings is odd, the point is inside.
    return (crossings % 2 == 1);
}


