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
   int borderWidth = 4;

   Rectangle[] rects = new Rectangle[8];

   r.Inflate(borderWidth, borderWidth);

   int x = r.Left - borderWidth;
   int y = r.Top - borderWidth;

   for (int i = 0; i < 8; i++)
   {
      rects[i] = new Rectangle(x, y, 2 * borderWidth, 2 * borderWidth);
      x = x + borderWidth + borderWidth / 2;
      y = y + borderWidth + borderWidth / 2;
   }

   for (int i = 0; i < 8; i++)
   {
      ControlPaint.DrawBorder(g, rects[i], Color.Black, ButtonBorderStyle.Dotted);
   }

   g.FillRectangles(Brushes.White, rects);
   g.DrawRectangles(Pens.Black, rects);
}


