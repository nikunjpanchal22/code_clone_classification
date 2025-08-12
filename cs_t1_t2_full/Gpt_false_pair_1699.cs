protected override void OnPaint (PaintEventArgs e) {
    const int inset = 2;
    using (Image offscreenImage = new Bitmap (this.Width, this.Height))
    {
        using (Graphics offscreen = Graphics.FromImage (offscreenImage))
        {
            Rectangle rect = new Rectangle (0, 0, this.Width, this.Height);
            if (ProgressBarRenderer.IsSupported)
                ProgressBarRenderer.DrawHorizontalBar (offscreen, rect);
            rect.Inflate (new Size (- inset, - inset));
            rect.Width = (int) (rect.Width * ((double) this.Value / this.Maximum));
            if (rect.Width == 0)
                rect.Width = 1;
            LinearGradientBrush brush = new LinearGradientBrush (rect, this.BackColor, this.ForeColor, LinearGradientMode.Vertical);
            offscreen.FillRectangle (brush, inset, inset, rect.Width, rect.Height);
            e.Graphics.DrawImage (offscreenImage, 0, 0);
            offscreenImage.Dispose ();
        }}}


 protected override void OnPaint (PaintEventArgs e) {
    const int inset = 4; 
    using (Image offscreenImage = new Bitmap (this.Width, this.Height))
    {
        using (Graphics offscreen = Graphics.FromImage (offscreenImage))
        {
                Rectangle rect = new Rectangle (0, 0, this.Width, this.Height);
                if (ProgressBarRenderer.IsSupported)
                    ProgressBarRenderer.DrawHorizontalBar (offscreen, rect);
                rect.Inflate (new Size (- inset, - inset));
                rect.Width = (int) (rect.Width * ((double) this.Value / this.Maximum));  
                if (rect.Width == 0)
                    rect.Width = 1; 
                PathGradientBrush brush = new PathGradientBrush (rect); 
                brush.CenterColor = this.BackColor; 
                brush.SurroundColors = new Color[] { this.ForeColor }; 
                offscreen.FillRectangle (brush, inset, inset, rect.Width, rect.Height); 
                e.Graphics.DrawImage (offscreenImage, 0, 0); 
                offscreenImage.Dispose ();
        }
   }
} 
