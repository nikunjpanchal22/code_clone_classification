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
    Bitmap bm = new Bitmap (tsi.Width, tsi.Height);
    Graphics g = Graphics.FromImage(bm);
    g.FillRectangle(Brushes.White, new Rectangle(0, 0, tsi.Width, tsi.Height));
    tsi.BackgroundImage = bm;
}


