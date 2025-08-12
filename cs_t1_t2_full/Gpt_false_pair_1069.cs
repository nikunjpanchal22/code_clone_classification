protected override void OnMouseMove (MouseEventArgs e) {
    if (e.Button == MouseButtons.Left) {
        rec.Width = e.X - rec.X;
        rec.Height = e.Y - rec.Y;
    } else if (e.Button == MouseButtons.Right) {
        rec.X = e.X - MouseDownLocation.X;
        rec.Y = e.Y - MouseDownLocation.Y;
    }
}


   protected override void OnMouseMove (MouseEventArgs e) {
    if (e.Button == MouseButtons.Left) {
        rec.Width = e.X - rec.Left;
        rec.Height = e.Y - rec.Top;
    } else if (e.Button == MouseButtons.Right) {
        rec.Left = e.X - MouseDownLocation.X;
        rec.Top = e.Y - MouseDownLocation.Y;
    }
}
