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

   Rectangle[] rectangles = new Rectangle[8] {
      new Rectangle(r.Left - d, r.Top - d, 2 * d, 2 * d),
      new Rectangle(r.Left + (d/2), r.Top - d, 2 * d, 2 * d),
      new Rectangle(r.Left + (3*d/2), r.Top - d, 2 * d, 2 * d),
      new Rectangle(r.Left + (3*d/2), r.Top + (d/2), 2 * d, 2 * d),
      new Rectangle(r.Left + (3*d/2), r.Top + (3*d/2), 2 * d, 2 * d),
      new Rectangle(r.Left + (d/2), r.Top + (3*d/2), 2 * d, 2 * d),
      new Rectangle(r.Left - d, r.Top + (3*d/2), 2 * d, 2 * d),
      new Rectangle(r.Left - d, r.Top + (d/2), 2 * d, 2 * d)
   };

   for (int i = 0; i < rectangles.Length; i++)
   {
      ControlPaint.DrawBorder(g, rectangles[i], Color.Black, ButtonBorderStyle.Dotted);
   }

   g.FillRectangles(Brushes.White, rectangles);
   g.DrawRectangles(Pens.Black, rectangles);
}


