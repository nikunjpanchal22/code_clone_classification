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
   if (e.Button.HasFlag(MouseButtons.Left)) {
        rec.Size = new Size(e.X - rec.X, e.Y - rec.Y);
    } else if (e.Button.HasFlag(MouseButtons.Right)){
        rec.Location = new Point(e.X - MouseDownLocation.X, e.Y - MouseDownLocation.Y);
    }
}


