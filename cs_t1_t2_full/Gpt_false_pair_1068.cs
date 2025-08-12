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
        rec.X = MouseDownLocation.X;
        rec.Y = MouseDownLocation.Y;
        rec.Width = e.X - MouseDownLocation.X;
        rec.Height = e.Y - MouseDownLocation.Y;
    } else if (e.Button == MouseButtons.Right) {
        rec.X = e.X - MouseDownLocation.X;
        rec.Y = e.Y - MouseDownLocation.Y;
    }
}
