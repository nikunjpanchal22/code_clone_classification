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



protected override void OnPaint(PaintEventArgs e) {
		    brush = brush == null || brush.Color != ForeColor ? new SolidBrush(ForeColor) : brush;
		    Rectangle rec = new Rectangle(Point.Empty, Size);
		    DrawProgressBar(e.Graphics, ref rec);
		    ModifyRectangle(ref rec);
		    FilledRectangle(e.Graphics, rec);
		}
		private void DrawProgressBar(Graphics graphics, ref Rectangle rec) {
		    if (ProgressBarRenderer.IsSupported) ProgressBarRenderer.DrawHorizontalBar(graphics, rec);
		}
		private void ModifyRectangle(ref Rectangle rec) {
		    rec.Width = (int)(rec.Width * Value / Maximum) - 4;
		    rec.Height -= 4;
		}
		private void FilledRectangle(Graphics graphics, Rectangle rec) {
		    graphics.FillRectangle (brush, 2, 2, rec.Width, rec.Height);
}


