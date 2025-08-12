private void DrawGroupBox (GroupBox box, Graphics g, Color textColor, Color borderColor) {
    if (box != null) {
        Brush textBrush = new SolidBrush (textColor);
        Brush borderBrush = new SolidBrush (borderColor);
        Pen borderPen = new Pen (borderBrush);
        SizeF strSize = g.MeasureString (box.Text, box.Font);
        Rectangle rect = new Rectangle (box.ClientRectangle.X, box.ClientRectangle.Y + (int) (strSize.Height / 2), box.ClientRectangle.Width - 1, box.ClientRectangle.Height - (int) (strSize.Height / 2) - 1);
        g.Clear (this.BackColor);
        g.DrawString (box.Text, box.Font, textBrush, box.Padding.Left, 0);
        g.DrawLine (borderPen, rect.Location, new Point (rect.X, rect.Y + rect.Height));
        g.DrawLine (borderPen, new Point (rect.X + rect.Width, rect.Y), new Point (rect.X + rect.Width, rect.Y + rect.Height));
        g.DrawLine (borderPen, new Point (rect.X, rect.Y + rect.Height), new Point (rect.X + rect.Width, rect.Y + rect.Height));
        g.DrawLine (borderPen, new Point (rect.X, rect.Y), new Point (rect.X + box.Padding.Left, rect.Y));
        g.DrawLine (borderPen, new Point (rect.X + box.Padding.Left + (int) (strSize.Width), rect.Y), new Point (rect.X + rect.Width, rect.Y));
    }
}



  private void DrawGroupBox (GroupBox box, Graphics g, Color textColor, Color borderColor) {
    if (box != null) {
        Brush textBrush = new SolidBrush (textColor);
        Brush borderBrush = new SolidBrush (borderColor);
        Pen borderPen = new Pen (borderBrush);
        SizeF strSize = g.MeasureString (box.Text, box.Font);
        Rectangle rect = new Rectangle (box.ClientRectangle.X, box.ClientRectangle.Y + (int) (strSize.Height / 2), box.ClientRectangle.Width - 1, box.ClientRectangle.Height - (int) (strSize.Height / 2) - 1);
        g.Clear (this.BackColor);
        g.DrawString (box.Text, box.Font, textBrush, box.Location);
        g.DrawLines (borderPen, new Point[] { 
            new Point (rect.Location, new Point (rect.X, rect.Y + rect.Height)),
            new Point (rect.X + rect.Width, rect.Y),
            new Point (rect.X + rect.Width, rect.Y + rect.Height),
            new Point (rect.X, rect.Y + rect.Height),
            new Point (rect.X, rect.Y),
            new Point (rect.X + box.Padding.Left, rect.Y),
            new Point (rect.X + box.Padding.Left + (int) (strSize.Width), rect.Y),
            new Point (rect.X + rect.Width, rect.Y)
        });
    }
}


