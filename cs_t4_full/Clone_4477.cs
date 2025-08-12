private void DefineGeometry () {
    var points = PointCollection;
    _figure.Segments.Clear ();
    if (points.Any ()) {
        _figure.StartPoint = points [0];
        if (points.Count > 1) {
            for (int i = 1; i < (points.Count - 1); i ++) {
                var v1 = (Point) points [i] - points [i - 1];
                var v2 = (Point) points [i + 1] - points [i];
                var radius = (points [i].Radius ?? Radius) ?? 0;
                radius = Math.Min (Math.Min (v1.Length, v2.Length) / 2, radius);
                double len = v1.Length;
                v1.Normalize ();
                v1 *= (len - radius);
                var line = new LineSegment ((Point) points [i - 1] + v1, true);
                _figure.Segments.Add (line);
                v2.Normalize ();
                v2 *= radius;
                var direction = (Vector.AngleBetween (v1, v2) > 0) ? SweepDirection.Clockwise : SweepDirection.Counterclockwise;
                var arc = new ArcSegment ((Point) points [i] + v2, new Size (radius, radius), 0, false, direction, true);
                _figure.Segments.Add (arc);
            }
            _figure.Segments.Add (new LineSegment (points [points.Count - 1], true));
        }
    }
}


  private void DefineGeometry()
{
    var segmentList = new List<PathSegment>();
    _figure.Segments.Clear();

    if (PointCollection.Any())
    {
        _figure.StartPoint = PointCollection[0];
        if (PointCollection.Count > 1)
        {
            for (int i = 1; i < (PointCollection.Count - 1); i ++)
            {
                Point v1 = PointCollection[i] - PointCollection[i-1];
                Point v2 = PointCollection[i+1] - PointCollection[i];

                // determine radius
                double radius = 0;
                if (PointCollection[i].Radius != null)
                    radius = PointCollection[i].Radius ?? 0;

                double tempRad = Math.Min(v1.Length, v2.Length) / 2;
                if (tempRad < radius)
                    radius = tempRad;

                // modify v1
                double v1Length = v1.Length;
                v1.Normalize();
                v1 *= (v1Length - radius);

                // segment 1 - line segment
                LineSegment line = new LineSegment(PointCollection[i-1] + v1, true);
                segmentList.Add(line);

                // modify v2
                v2.Normalize();
                v2 *= radius;

                SweepDirection dir;
                if (Vector.AngleBetween(v1, v2) > 0)
                    dir = SweepDirection.Clockwise;
                else
                    dir = SweepDirection.Counterclockwise;

                // segment 2 - arc
                ArcSegment arc = new ArcSegment(PointCollection[i] + v2, new Size(radius, radius), 0.0, false, dir, true);
                segmentList.Add(arc);
            }
            segmentList.Add(new LineSegment(PointCollection[PointCollection.Count - 1], true));
        }
    }
    _figure.Segments = new PathSegmentCollection(segmentList);
}


