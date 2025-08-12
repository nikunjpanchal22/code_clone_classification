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


 
protected override void OnPaint (PaintEventArgs e) {
    float x = 10.0F;
    float y = 15.0F;
    string drawString = "123";
    using (SolidBrush brush = new SolidBrush (Color.Salmon))
    using (Font drawFont = new Font ("Arial", 12))
    {
        foreach (char c in drawString.ToCharArray ()) {
            PointF p = new PointF (x, y);
            e.Graphics.DrawString (c.ToString (), drawFont, brush, p);
            x += drawFont.Height;
        }
    } base.OnPaint (e);
}
