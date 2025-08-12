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
    float xNew, yNew;
    bool inside = false;
    xNew = p.X;
    yNew = p.Y;

    int side_count = 0;
    int i, j = poly.Length-1;

    for (i = 0; i < poly.Length; i++)
    {
        if (poly[i].Y < yNew && poly[j].Y >= yNew || poly[j].Y < yNew && poly[i].Y >= yNew)
        {
            if (poly[i].X + (yNew-poly[i].Y)/(poly[j].Y-poly[i].Y)*(poly[j].X-poly[i].X) < xNew)
            {
                side_count++;
            }
        }
        j = i; 
    }

    if (side_count % 2 != 0)
    {
        inside = true;
    }

    return inside;
}


