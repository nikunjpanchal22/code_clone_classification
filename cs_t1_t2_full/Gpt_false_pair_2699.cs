protected override void WndProc (ref Message m) {
    base.WndProc (ref m);
    if (m.Msg == WM_PAINT) {
        using (Graphics g = Graphics.FromHwnd (m.HWnd))
        {
            if (tabControl.Parent != null) {
                g.SetClip (new Rectangle (0, 0, tabControl.Width - 2, tabControl.Height - 1), CombineMode.Exclude);
                using (SolidBrush sb = new SolidBrush (tabControl.Parent.BackColor))
                g.FillRectangle (sb, new Rectangle (0, tabControl.ItemSize.Height + 2, tabControl.Width, tabControl.Height - (tabControl.ItemSize.Height + 2)));
            }
            if (tabControl.SelectedTab != null) {
                g.ResetClip ();
                Rectangle r = tabControl.SelectedTab.Bounds;
                g.SetClip (r, CombineMode.Exclude);
                using (SolidBrush sb = new SolidBrush (tabControl.SelectedTab.BackColor))
                g.FillRectangle (sb, new Rectangle (r.Left - 3, r.Top - 1, r.Width + 4, r.Height + 3));
            }
        }}
}


protected override void WndProc (ref Message m) {
    base.WndProc (ref m);
    if (m.Msg == WM_PAINT) {
        using (Graphics g = Graphics.FromHwnd (m.HWnd))
        {
            if (tabControl.Parent != null) {
                g.SetClip (new Rectangle (0, 0, tabControl.Width - 2, tabControl.Height - 1), CombineMode.Exclude);
                using (SolidBrush sb = new SolidBrush (tabControl.Parent.BackColor))
                g.FillRectangle (sb, new Rectangle (0, tabControl.ItemSize.Height + 5, tabControl.Width, tabControl.Height - (tabControl.ItemSize.Height + 2)));
            }
            if (tabControl.SelectedTab != null) {
                g.ResetClip ();
                Rectangle r = tabControl.SelectedTab.Bounds;
                g.SetClip (r, CombineMode.Exclude);
                using (SolidBrush sb = new SolidBrush (tabControl.SelectedTab.BackColor))
                g.FillRectangle (sb, new Rectangle (r.Left - 5, r.Top - 4, r.Width + 7, r.Height + 6));
            }
        }}
}
