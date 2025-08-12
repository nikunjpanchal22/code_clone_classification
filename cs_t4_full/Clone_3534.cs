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
        }}}





private void panel1_MouseMove (object sender, MouseEventArgs e) 
{
    var g = panel1.CreateGraphics();
    var pen = new Pen(Color.Blue, PEN_WIDTH)
    {
        StartCap = START_CAP,
        EndCap = END_CAP
    };
    g.DrawLine(pen, mAnchorPoint, mPreviousPoint);
    mPreviousPoint = e.Location;
}


