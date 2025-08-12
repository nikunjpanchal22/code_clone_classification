private void newToolStripMenuItem_Click (object sender, EventArgs e) {
    if (f2 == null || f2.IsDisposed) {
        f2 = new Form2 ();
        f2.MdiParent = this;
        f2.Show ();
    } else {
        if (f2.WindowState == FormWindowState.Minimized) {
            f2.WindowState = FormWindowState.Normal;
        }
        f2.Activate ();
    }
}


 private void newToolStripMenuItem_Click (object sender, EventArgs e) {
    if (f2 == null || f2.IsDisposed) {
        f2 = new Form2();
        f2.MdiParent = this;
        f2.Show();
    } else {
        if (Application.OpenForms.OfType<Form2>().Any())
            f2.Activate();
    }
}
