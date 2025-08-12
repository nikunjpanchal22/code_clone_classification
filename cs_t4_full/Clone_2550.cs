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





protected override void OnPaint(PaintEventArgs e)
{
    LinearGradientBrush brush = new LinearGradientBrush(new Point(0, 0), new Point(this.Width, this.Height), this.ForeColor, this.BackColor);
    double scaleFactor = (((double)Value - (double)Minimum) / ((double)Maximum - (double)Minimum));
    if (ProgressBarRenderer.IsSupported)
        ProgressBarRenderer.DrawHorizontalBar(e.Graphics, new Rectangle(0, 0, (int)(this.Width * scaleFactor), this.Height - 4));
    e.Graphics.FillRectangle(brush, 2, 2, this.Width - 4, this.Height - 4);
}


