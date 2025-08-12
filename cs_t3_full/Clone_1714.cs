protected override void WndProc (ref Message m) {
    switch (m.Msg) {
        case 0x46 :
            this.HandleWindowPosChanging (ref m);
            base.WndProc (ref m);
            break;
        default :
            base.WndProc (ref m);
            break;
    }
}


	protected override void WndProc (ref Message m) {
    switch (m.Msg) {
        case 0x464 :
            this.HandleWindowPosChanging (ref m);
            base.WndProc (ref m);
            break; 
        case 0x2011:
            break;
        default :
            break;
    }
    base.WndProc (ref m);
}


