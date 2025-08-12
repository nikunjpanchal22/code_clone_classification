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


 private void DefineGeometry () 
{
	PathSegmentCollection segments = new PathSegmentCollection ();
	_figure.Segments.Clear ();

	if (PointCollection.Any ()) 
	{
		_figure.StartPoint = PointCollection[0];
		if (PointCollection.Count > 1) 
		{
			for (int i = 1; i < (PointCollection.Count - 1); i ++) 
			{
				Point v1 = PointCollection[i] - PointCollection[i - 1];
				Point v2 = PointCollection[i + 1] - PointCollection[i];
				double radius = (PointCollection[i].Radius ?? Radius) ?? 0;
				radius = Math.Min (Math.Min (v1.Length, v2.Length) / 2, radius);
				double len1 = v1.Length;
				v1.Normalize ();
				v1 *= (len1 - radius);
				LineSegment line = new LineSegment (PointCollection[i - 1] + v1, true);
				segments.Add (line);
				v2.Normalize ();
				double len2 = v2.Length;
				v2 *= radius;
				SweepDirection dir;
				if (Vector.AngleBetween (v1, v2) > 0)
					dir = SweepDirection.Clockwise;
				else
					dir = SweepDirection.Counterclockwise;
				ArcSegment arc = new ArcSegment (PointCollection[i] + v2, new Size (radius, radius), 0, false, dir, true);
				segments.Add (arc);
			}
			segments.Add (new LineSegment (PointCollection[PointCollection.Count - 1], true));
		}
	}
	_figure.Segments = segments;
}


