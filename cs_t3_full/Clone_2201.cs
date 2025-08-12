private void tsi_MouseEnter (object sender, EventArgs e) {
    ToolStripItem tsi = (ToolStripItem) sender;
    Bitmap bm = new Bitmap (tsi.Width, tsi.Height);
    for (int y = 0; y < tsi.Height; y ++) {
        for (int x = 0; x < tsi.Width; x ++)
            bm.SetPixel (x, y, Color.FromArgb (150, Color.White));
    }
    tsi.BackgroundImage = bm;
}



private void tsi_MouseEnter (object sender, EventArgs e) {
    ToolStripItem tsi = (ToolStripItem) sender;
    Bitmap bm = new Bitmap(tsi.Width, tsi.Height);
    Rectangle r = new Rectangle(Point.Empty, bm.Size);
    for (int i = r.Left; i < r.Right; i++)
      for (int j = r.Top; j < r.Bottom; j++)
         bm.SetPixel(i, j, Color.FromArgb(150, Color.White));
    tsi.BackgroundImage = bm;
}


