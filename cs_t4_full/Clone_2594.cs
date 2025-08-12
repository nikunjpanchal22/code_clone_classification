protected override void OnPaint (PaintEventArgs e) {
    if (brush == null || brush.Color != this.ForeColor)
        brush = new SolidBrush (this.ForeColor);
    Rectangle rec = new Rectangle (0, 0, this.Width, this.Height);
    if (ProgressBarRenderer.IsSupported)
        ProgressBarRenderer.DrawHorizontalBar (e.Graphics, rec);
    rec.Width = (int) (rec.Width * ((double) Value / Maximum)) - 4;
    rec.Height = rec.Height - 4;
    e.Graphics.FillRectangle (brush, 2, 2, rec.Width, rec.Height);
}



protected override void OnPaint (PaintEventArgs e) {
    SolidBrush UpdateBrush () => brush = brush == null || brush.Color != ForeColor ? new SolidBrush(ForeColor): brush;
    Rectangle CreateRectangle() => new Rectangle(0,0, Width, Height);
    Rectangle ResizeRectangle(Rectangle rec) => new Rectangle(rec.Left+2,rec.Top+2, (int)(rec.Width * ((double)Value / Maximum)) - 4, rec.Height - 4);
    if (ProgressBarRenderer.IsSupported) ProgressBarRenderer.DrawHorizontalBar(e.Graphics, CreateRectangle());
    e.Graphics.FillRectangle (UpdateBrush(), ResizeRectangle(CreateRectangle()));
}


