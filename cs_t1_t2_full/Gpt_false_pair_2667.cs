protected override void OnPaint (PaintEventArgs e) {
    float x = 10.0F;
    float y = 10.0F;
    string drawString = "123";
    using (SolidBrush brush = new SolidBrush (Color.Black))
    using (Font drawFont = new Font ("Arial", 16))
    {
        foreach (char c in drawString.ToCharArray ()) {
            PointF p = new PointF (x, y);
            e.Graphics.DrawString (c.ToString (), drawFont, brush, p);
            y += drawFont.Height;
        }
    } base.OnPaint (e);
}


protected override void OnPaint(PaintEventArgs e) {
    float x = 20.0F;
    float y = 20.0F;
    string drawString = "456";
    using (SolidBrush brush = new SolidBrush (Color.Blue))
    using (Font drawFont = new Font ("Arial", 16))
    {
        foreach (char c in drawString.ToCharArray ()) {
            PointF p = new PointF (x, y);
            e.Graphics.DrawString (c.ToString (), drawFont, brush, p);
            y += drawFont.Height;
        }
    } 
    base.OnPaint (e);
}
