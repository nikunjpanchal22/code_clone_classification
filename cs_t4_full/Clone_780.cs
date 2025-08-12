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
        int width = e.X - MouseDownLocation.X;
        int height = e.Y - MouseDownLocation.Y;
        rec.X = MouseDownLocation.X;
        rec.Y = MouseDownLocation.Y;
        rec.Width = Math.Max(0, width);
        rec.Height = Math.Max(0, height);
    } else if (e.Button == MouseButtons.Right) {
        rec.X = e.X - MouseDownLocation.X;
        rec.Y = e.Y - MouseDownLocation.Y;
    }
}


