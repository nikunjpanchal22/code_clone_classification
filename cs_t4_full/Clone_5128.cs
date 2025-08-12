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
  Pen blackPen = new Pen(Color.Black);
  int borderWidth = 4;
  r.Inflate(borderWidth, borderWidth);
  Rectangle rect1 = new Rectangle(r.Left - borderWidth, r.Top - borderWidth, (2 * borderWidth), (2 * borderWidth));
  g.DrawRectangle(blackPen, rect1);
  Rectangle rect2 = new Rectangle(r.Left + (borderWidth/2), r.Top - borderWidth, (2 * borderWidth), (2 * borderWidth));
  g.DrawRectangle(blackPen, rect2);
  Rectangle rect3 = new Rectangle(r.Left + (3*borderWidth/2), r.Top - borderWidth, (2 * borderWidth), (2 * borderWidth));
  g.DrawRectangle(blackPen, rect3);
  Rectangle rect4 = new Rectangle(r.Left + (3*borderWidth/2), r.Top + (borderWidth/2), (2 * borderWidth), (2 * borderWidth));
  g.DrawRectangle(blackPen, rect4);
  Rectangle rect5 = new Rectangle(r.Left + (3*borderWidth/2), r.Top + (3*borderWidth/2), (2 * borderWidth), (2 * borderWidth));
  g.DrawRectangle(blackPen, rect5);
  Rectangle rect6 = new Rectangle(r.Left + (borderWidth/2), r.Top + (3*borderWidth/2), (2 * borderWidth), (2 * borderWidth));
  g.DrawRectangle(blackPen, rect6);
  Rectangle rect7 = new Rectangle(r.Left - borderWidth, r.Top + (3*borderWidth/2), (2 * borderWidth), (2 * borderWidth));
  g.DrawRectangle(blackPen, rect7);
  Rectangle rect8 = new Rectangle(r.Left - borderWidth, r.Top + (borderWidth/2), (2 * borderWidth), (2 * borderWidth));
  g.DrawRectangle(blackPen, rect8);
  g.FillRectangles(Brushes.White, new Rectangle[] { rect1, rect2, rect3, rect4, rect5, rect6, rect7, rect8});
  g.DrawRectangles(Pens.Black, new Rectangle[] { rect1, rect2, rect3, rect4, rect5, rect6, rect7, rect8});
}


