public static GraphicsPath Shrink (this GraphicsPath path, float width) {
    using (var p = new GraphicsPath ())
    {
        p.AddPath (path, false);
        p.CloseAllFigures ();
        p.Widen (new Pen (Color.Black, width * 2));
        var position = 0;
        var result = new GraphicsPath ();
        while (position < p.PointCount) {
            position += CountNextFigure (p.PathData, position);
            var figureCount = CountNextFigure (p.PathData, position);
            var points = new PointF [figureCount];
            var types = new byte [figureCount];
            Array.Copy (p.PathPoints, position, points, 0, figureCount);
            Array.Copy (p.PathTypes, position, types, 0, figureCount);
            position += figureCount;
            result.AddPath (new GraphicsPath (points, types), false);
        }
        path.Reset ();
        path.AddPath (result, false);
        return path;
    }}


 public static GraphicsPath Shrink (this GraphicsPath path, float width) {
     using (GraphicsPath gPath = new GraphicsPath ()) 
     {
        gPath.AddPath (path, false);
        gPath.CloseAllFigures ();
        gPath.Widen (new Pen (Color.Black, width * 2));
        
        List<PointF> points = new List<PointF> ();
        List<byte> types = new List<byte> ();
        
        for (int pos = 0; pos < gPath.PointCount; )
        {
            pos += CountNextFigure (gPath.PathData, pos);
            int figureCount = CountNextFigure (gPath.PathData, pos);

            for (int i = 0; i < figureCount; i++)
            {
                points.Add (gPath.PathPoints [pos + i]);
                types.Add (gPath.PathTypes [pos + i]);
            }
            pos += figureCount;
        }

        path.Reset ();
        path.AddPath (new GraphicsPath (points.ToArray(), types.ToArray()), false);
        return path;
    }
}


