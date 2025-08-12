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
	    brush = (brush == null || brush.Color != ForeColor) ? new SolidBrush(ForeColor): brush;
	    var rec = new Rectangle(0,0, Width, Height);
	    if (ProgressBarRenderer.IsSupported) ProgressBarRenderer.DrawHorizontalBar(e.Graphics, rec);
	    RecalculateRectangle(ref rec);
	    e.Graphics.FillRectangle(brush, new Rectangle(2,2, rec.Width, rec.Height));
	}
	private void RecalculateRectangle(ref Rectangle rec) {
	    rec.Width = (int)(rec.Width * Value / Maximum) - 4;
	    rec.Height -= 4;
}


