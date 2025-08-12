void DrawBorder (Graphics g, Rectangle r) {
    var d = 4;
    r.Inflate (d, d);
    ControlPaint.DrawBorder (g, r, Color.Black, ButtonBorderStyle.Dotted);
    var rectangles = new List < Rectangle > ();
    var r1 = new Rectangle (r.Left - d, r.Top - d, 2 * d, 2 * d);
    rectangles.Add (r1);
    r1.Offset (r.Width / 2, 0);
    rectangles.Add (r1);
    r1.Offset (r.Width / 2, 0);
    rectangles.Add (r1);
    r1.Offset (0, r.Height / 2);
    rectangles.Add (r1);
    r1.Offset (0, r.Height / 2);
    rectangles.Add (r1);
    r1.Offset (- r.Width / 2, 0);
    rectangles.Add (r1);
    r1.Offset (- r.Width / 2, 0);
    rectangles.Add (r1);
    r1.Offset (0, - r.Height / 2);
    rectangles.Add (r1);
    g.FillRectangles (Brushes.White, rectangles.ToArray ());
    g.DrawRectangles (Pens.Black, rectangles.ToArray ());
}


 void DrawBorder (Graphics g, Rectangle r)
{
    int d = 4;

    r.Inflate(d, d);

    ControlPaint.DrawBorder(g, r, Color.Black, ButtonBorderStyle.Dotted);

    List<Rectangle> rectList = new List<Rectangle>();

    for (int i = 0; i < 8; i++)
    {
        rectList.Add(new Rectangle(r.Left - d, r.Top - d, 2 * d, 2 * d));
        rectList[i].Offset(r.Width / 2 * (i % 3), r.Height / 2 * (i / 3));
    }

    g.FillRectangles(Brushes.White, rectList.ToArray());

    g.DrawRectangles(Pens.Black, rectList.ToArray());
}


