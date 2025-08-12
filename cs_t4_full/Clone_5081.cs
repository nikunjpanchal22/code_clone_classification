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
    //if the message is 0x46 
    if (m.Msg == 0x46) {
        this.HandleWindowPosChanging (ref m);
        base.WndProc (ref m);
        return;
    }

    base.WndProc (ref m);
}


