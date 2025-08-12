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
    if (e.Button == MouseButtons.Left){
        rec.Size = new Size (e.Location.X - rec.Left, e.Location.Y - rec.Top);
    } else if (e.Button == MouseButtons.Right){
        rec.Location = new Point (e.Location.X - MouseDownLocation.X, e.Location.Y - MouseDownLocation.Y);
    }
}


