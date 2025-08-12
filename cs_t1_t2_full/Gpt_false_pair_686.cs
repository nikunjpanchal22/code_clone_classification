protected override void OnPaint (PaintEventArgs e) {
    Rectangle rec = e.ClipRectangle;
    rec.Width = (int) (rec.Width * ((double) Value / Maximum)) - 4;
    if (ProgressBarRenderer.IsSupported)
        ProgressBarRenderer.DrawHorizontalBar (e.Graphics, e.ClipRectangle);
    rec.Height = rec.Height - 4;
    e.Graphics.FillRectangle (Brushes.Red, 2, 2, rec.Width, rec.Height);
}


  protected override void OnPaint (PaintEventArgs e) {
        Rectangle rec = e.ClipRectangle;
		rec.Width = (int) (rec.Width * ((double) Value / Maximum)) - 20;
		if (ProgressBarRenderer.IsSupported)
			ProgressBarRenderer.DrawHorizontalBar (e.Graphics, e.ClipRectangle);
        rec.Height = rec.Height - 20;
		e.Graphics.FillRectangle (Brushes.Purple, 2, 2, rec.Width, rec.Height);
}
