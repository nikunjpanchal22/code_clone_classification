private void ScaleControls (Control c, ref Graphics g, double s) {
    List < Control > hold = null;
    foreach (Control ctrl in c.Controls) {
        if (ctrl is GroupBox || ctrl is Panel) {
            hold = new List < Control > ();
            foreach (Control gctrl in ctrl.Controls) {
                hold.Add (gctrl);
            }
            ctrl.Controls.Clear ();
        }
        Point oldLoc = ctrl.Location;
        Size oldSize = ctrl.Size;
        Font oldFont = ctrl.Font;
        ctrl.Location = new Point (ctrl.Location.X * s, ctrl.Location.Y * s);
        ctrl.Size = new Size (ctrl.Size.Width * s, ctrl.Height * s);
        ctrl.Font = new Font (ctrl.Font.FontFamily, ctrl.Font.Size * 5, ctrl.Font.Style, ctrl.Font.Unit);
        using (Bitmap bmp = new Bitmap (ctrl.Size.Width, ctrl.Size.Height))
        {
            ctrl.DrawToBitmap (bmp, ctrl.ClientRectangle);
            g.DrawImage (bmp, ctrl.Location);
        } ctrl.Location = oldLoc;
        ctrl.Size = oldSize;
        ctrl.Font = oldFont;
        if (ctrl is GroupBox || ctrl is Panel) {
            foreach (Control gctrl in hold) {
                ctrl.Controls.Add (gctrl);
            }
            ScaleControls (ctrl, g, s);
        }
    }
}


 private void ScaleControls (Control c, ref Graphics g, double s) {
                foreach (Control ctrl in c.Controls) {
                    Point oldLoc = ctrl.Location;
                    Size oldSize = ctrl.Size;
                    Font oldFont = ctrl.Font;
                    ctrl.Location = new Point (ctrl.Location.X*s, ctrl.Location.Y*s);
                    ctrl.Size = new Size (ctrl.Size.Width*s, ctrl.Height*s);
                    ctrl.Font = new Font (ctrl.Font.FontFamily, ctrl.Font.Size*5, ctrl.Font.Style, ctrl.Font.Unit);
                    if (ctrl is GroupBox || ctrl is Panel) {
                       ctrl.Size = new Size (ctrl.Size.Width*s, ctrl.Height*s);
                        List<Control> cl = new List<Control>(ctrl.Controls);
                        foreach (Control gctrl in ctrl.Controls) {
                            g.DrawImage (gctrl.Image, ctrl.Location);
                        }
                        foreach (Control gctrl in cl) {
                            gctrl.Location = new Point (gctrl.Location.X*s, gctrl.Location.Y*s);
                            gctrl.Size = new Size (gctrl.Size.Width*s, gctrl.Height*s);
                            gctrl.Font = new Font (gctrl.Font.FontFamily, gctrl.Font.Size*s, gctrl.Font.Style, gctrl.Font.Unit);
                            using (Bitmap bmp = new Bitmap (ctrl.Size.Width, ctrl.Size.Height))
                            {
                                ctrl.DrawToBitmap (bmp, ctrl.ClientRectangle);
                                g.DrawImage (bmp, ctrl.Location);
                            }
                        }
                       ctrl.Size = oldSize;
                        ScaleControls (ctrl, g, s);
                    } else {
                        using (Bitmap bmp = new Bitmap (ctrl.Size.Width, ctrl.Size.Height))
                        {
                            ctrl.DrawToBitmap (bmp, ctrl.ClientRectangle);
                            g.DrawImage (bmp, ctrl.Location);
                        }
                    }
                    ctrl.Location = oldLoc;
                    ctrl.Size = oldSize;
                    ctrl.Font = oldFont;
                }
}


