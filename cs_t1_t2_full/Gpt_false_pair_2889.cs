protected override void WndProc (ref Message m) {
    if (m.Msg == 0x0203) {
        int start = SelectionStart;
        if (start < 1)
            start = 1;
        int left = - 1;
        int right = Text.Length;
        int pos;
        foreach (char c in delimiterList) {
            pos = Text.LastIndexOf (c, start - 1);
            if (pos > left)
                left = pos;
            pos = Text.IndexOf (c, start);
            if (pos < right && pos != - 1)
                right = pos;
        }
        SelectionStart = left + 1;
        SelectionLength = right - left - 1;
        return;
    }
    base.WndProc (ref m);
}


protected override void WndProc (ref Message m) {
    if (m.Msg == 0x0203) {
        int start = SelectionStart;
        start = start < 1 ? 1 : start;
        int left = - 1;
        int right = Text.Length;
        foreach (char c in delimiterList) {
            int tempPos = Text.LastIndexOf (c, start - 1);
            if (tempPos > left)
                left = tempPos;
            tempPos = Text.IndexOf (c, start);
            if (tempPos < right && tempPos != - 1)
                right = tempPos;
        }
        SelectionStart = left + 1;
        SelectionLength = right - left - 1;
        return;
    }
    base.WndProc (ref m);
}
