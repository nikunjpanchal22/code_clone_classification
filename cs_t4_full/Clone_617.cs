protected override void WndProc (ref Message m) {
    const int WM_NCLBUTTONDOWN = 0x00A1;
    const int WM_NCLBUTTONUP = 0x00A2;
    const int HTCLOSE = 20;
    if (m.Msg == WM_NCLBUTTONDOWN) {
        switch ((int) m.WParam) {
            case HTCLOSE :
                break;
            default :
                base.WndProc (ref m);
                break;
        }
    } else {
        if (m.Msg == WM_NCLBUTTONUP) {
            switch ((int) m.WParam) {
                case HTCLOSE :
                    Trace.WriteLine ("Close Button clicked");
                    Close ();
                    break;
            }
        }
        base.WndProc (ref m);
    }
}


 protected override void WndProc (ref Message m) {
    const int WM_NCLBUTTONDOWN = 0x00A1;
    const int WM_NCLBUTTONUP = 0x00A2;
    const int HTCLOSE = 20;
    if (m.Msg == WM_NCLBUTTONDOWN || m.Msg == WM_NCLBUTTONUP) {
        switch (m.WParam.ToInt32()) {
            case HTCLOSE:
                Trace.WriteLine("Close Button clicked");
                Close();
                break;
        }
    }
    else
        base.WndProc (ref m);
}


