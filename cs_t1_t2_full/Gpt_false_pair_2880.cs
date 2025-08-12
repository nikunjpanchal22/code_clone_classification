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
                radius = Math.Min (radius, Math.Min (v1.Length, v2.Length));
                double len = v1.Length;
                v1.Normalize ();
                v1 *= (len - radius);
                var line = new LineSegment ((Point) points [i - 1] + v1, true);
                _figure.Segments.Add (line);
                v2.Normalize ();
                v2 *= radius * 0.75;
                var direction = (Vector.AngleBetween (v1, v2) >= 0) ? SweepDirection.Clockwise : SweepDirection.Counterclockwise;
                var arc = new ArcSegment ((Point) points [i] + v2, new Size (radius, radius), 0, false, direction, true);
                _figure.Segments.Add (arc);
            }
            _figure.Segments.Add (new LineSegment (points [points.Count - 1], true));
        }
    }
}
