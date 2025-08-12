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

   List<Rectangle> rectangles = new List<Rectangle>();

   // Create the first rectangle 
   rectangles.Add(new Rectangle(r.Left - d, r.Top - d, 2 * d, 2 * d));
   // Create each successive rectangles 
   for (int i = 1; i < 8; i++)
   {
      int xOffset = (i % 3 == 0) ? r.Width / 2 : (i % 3 == 2 ? ((2 * r.Width) / 2) : 0);
      int yOffset = (i > 2 && i < 6) ? (r.Height / 2) : (i >= 6 ? (2 * r.Height) : 0);

      rectangles.Add(new Rectangle(rectangles[i - 1].X + xOffset, rectangles[i - 1].Y + yOffset, 2 * d, 2 * d));
   }

   foreach (Rectangle rect in rectangles)
   {
      ControlPaint.DrawBorder(g, rect, Color.Black, ButtonBorderStyle.Dotted);
   }

   g.FillRectangles(Brushes.White, rectangles.ToArray());
   g.DrawRectangles(Pens.Black, rectangles.ToArray());
}


