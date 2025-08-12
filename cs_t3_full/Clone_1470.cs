private void panel1_MouseMove (object sender, MouseEventArgs e) {
    using (Graphics g = panel1.CreateGraphics ())
    {
        using (Pen clear_pen = new Pen (panel1.BackColor, PEN_WIDTH))
        {
            clear_pen.StartCap = START_CAP;
            clear_pen.EndCap = END_CAP;
            g.DrawLine (clear_pen, mAnchorPoint, mPreviousPoint);
        } mPreviousPoint = e.Location;
        using (Pen draw_pen = new Pen (Color.Black, PEN_WIDTH))
        {
            draw_pen.StartCap = START_CAP;
            draw_pen.EndCap = END_CAP;
            g.DrawLine (draw_pen, mAnchorPoint, e.Location);
        }}
}


 private void panel1_MouseMove (object sender, MouseEventArgs e) {
    using (Graphics g = panel1.CreateGraphics ())
    {
        using (Pen clear_pen = new Pen (panel1.BackColor, 7))
        {
            clear_pen.StartCap = System.Drawing.Drawing2D.LineCap.Square;
            clear_pen.EndCap = System.Drawing.Drawing2D.LineCap.Square;
            g.DrawLine (clear_pen, mAnchorPoint, mPreviousPoint);
        } mPreviousPoint = e.Location;
        using (Pen draw_pen = new Pen (Color.Black, 7))
        {
            draw_pen.StartCap = System.Drawing.Drawing2D.LineCap.Square;
            draw_pen.EndCap = System.Drawing.Drawing2D.LineCap.Square;
            g.DrawLine (draw_pen, mAnchorPoint, e.Location);
        }
   }
}


