private void DrawLines (Graphics g) {
    g.Clear (BackColor);
    int y = - editBox.ScrollPos.Y;
    for (var i = 1; i < _lines + 1; i ++) {
        var size = g.MeasureString (i.ToString (), Font);
        g.DrawString (i.ToString (), Font, new SolidBrush (LineNumberColor), new Point (3, y));
        y += Font.Height + 2;
    }
    var max = (int) g.MeasureString ((_lines + 1).ToString (), Font).Width + 6;
    editBox.Location = new Point (max, 0);
    editBox.Size = new Size (ClientRectangle.Width - max, ClientRectangle.Height);
}


private void DrawLines (Graphics g) {
    g.Clear (BackColor);
    int y = - editBox.ScrollPos.Y;
    for (var i = 1; i < _lines + 1; i ++) {
        var size = g.MeasureString (i.ToString (), Font);
        g.DrawString (i.ToString (), Font, Brushes.Black, new Point (3, y));
        y += Font.Height + 2;
    }
    var max = (int) g.MeasureString ((_lines + 1).ToString (), Font).Width + 6;
    editBox.Location = new Point (max, 0);
    editBox.Size = new Size (ClientRectangle.Width - max, ClientRectangle.Height);
} 
