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

   // Draw the main border.
   ControlPaint.DrawBorder(g, r, Color.Black, ButtonBorderStyle.Dotted);

   // Calculate the number of rows and columns that the main border has.
   int columnCount = (int)Math.Ceiling((double)r.Width / (2 * d));
   int rowCount = (int)Math.Ceiling((double)r.Height / (2 * d));
   int numberOfRectangles = columnCount * rowCount;

   // Create the rectangles.
   Rectangle[] rects = new Rectangle[numberOfRectangles];
   int currentRectangle = 0;
   int x = r.Left - d;
   int y = r.Top - d;

   for (int i = 0; i < rowCount; i++)
   {
      // Calculate the start and end x coordinates.
      int startX = x;
      int endX = x + (2 * d) * columnCount;

      // Create the rectangles.
      for (int j = 0; j < columnCount; j++)
      {
         rects[currentRectangle++] = new Rectangle(startX, y, (2 * d), (2 * d));
         startX += 2 * d;
      }

      y += 2 * d;
      x = startX - endX;
   }

   foreach (Rectangle rect in rects)
   {
      ControlPaint.DrawBorder(
         g,
         rect,
         Color.Black,
         ButtonBorderStyle.Dotted);
   }

   g.FillRectangles(Brushes.White, rects);
   g.DrawRectangles(Pens.Black, rects);
}


