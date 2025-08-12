protected override void OnPaint (PaintEventArgs e) {
    LinearGradientBrush brush = null;
    Rectangle rec = new Rectangle (0, 0, this.Width, this.Height);
    double scaleFactor = (((double) Value - (double) Minimum) / ((double) Maximum - (double) Minimum));
    if (ProgressBarRenderer.IsSupported)
        ProgressBarRenderer.DrawHorizontalBar (e.Graphics, rec);
    rec.Width = (int) ((rec.Width * scaleFactor) - 4);
    rec.Height -= 4;
    brush = new LinearGradientBrush (rec, this.ForeColor, this.BackColor, LinearGradientMode.Vertical);
    e.Graphics.FillRectangle (brush, 2, 2, rec.Width, rec.Height);
}


 protected override void OnPaint (PaintEventArgs e) {
    PathGradientBrush brush = null;
    Rectangle rec = new Rectangle (0, 0, this.Width, this.Height);
    double scaleFactor = (((double) Value - (double) Minimum) / ((double) Maximum - (double) Minimum));
    if (ProgressBarRenderer.IsSupported)
        ProgressBarRenderer.DrawHorizontalBar (e.Graphics, rec);
    rec.Width = (int) ((rec.Width * scaleFactor) - 4);
    rec.Height -= 4;
    brush = new PathGradientBrush(new Point []{new Point(this.Width, rec.Height/2),
    new Point(rec.Width, 0)}, this.ForeColor);
    e.Graphics.FillRectangle (brush, 2, 2, rec.Width, rec.Height);
}
