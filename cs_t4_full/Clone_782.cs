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
        rec.SetBounds (MouseDownLocation.X, MouseDownLocation.Y, e.X, e.Y);
    } else if (e.Button == MouseButtons.Right) {
        rec.Location = new Point (
            e.X - MouseDownLocation.X, 
            e.Y - MouseDownLocation.Y
        );
    }
}


