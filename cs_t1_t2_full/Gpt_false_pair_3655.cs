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
    Brush brush = null;
    Rectangle rec = new Rectangle (0, 0, this.Width, this.Height);
    float scaleFactor = (((float) Value - (float) Minimum) / ((float) Maximum - (float) Minimum));
    if (ProgressBarRenderer.IsSupported)
        ProgressBarRenderer.DrawHorizontalBar (e.Graphics, rec);
    rec.Width = (int) ((rec.Width * scaleFactor) - 4);
    rec.Height -= 4;
    brush = new LinearGradientBrush (rec, this.ForeColor, this.BackColor, LinearGradientMode.Vertical);
    e.Graphics.FillRectangle (brush, 2, 2, rec.Width, rec.Height);
} 
