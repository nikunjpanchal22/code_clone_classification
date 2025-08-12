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
		    UpdateBrush();
		    var rec = new Rectangle(0,0, Width, Height);
		    DrawProgressBarOnSupport(e.Graphics, rec);
		    ResizeRectangle(ref rec);
		    FillGraphicsRectangle(e.Graphics, rec);
		}
		private void UpdateBrush() {
		    if(brush?.Color != ForeColor) brush = new SolidBrush(ForeColor);
		}
		private void DrawProgressBarOnSupport(Graphics g, Rectangle rec) {
		    if (ProgressBarRenderer.IsSupported) ProgressBarRenderer.DrawHorizontalBar(g, rec);
		}
		private void ResizeRectangle(ref Rectangle rec) {
		    rec.Width = (int)(rec.Width * ((double)Value / Maximum)) - 4;
		    rec.Height -= 4;
		}
		private void FillGraphicsRectangle(Graphics g, Rectangle rec) {
		    g.FillRectangle(brush, 2, 2, rec.Width, rec.Height);
}


