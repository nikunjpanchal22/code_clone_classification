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


protected override void WndProc(ref Message m) 
{ 
    if (m.Msg == 0x0203) 
    { 
        int start = SelectionStart; 
        if (start < 1) 
            start = 1; 
        int left = -1;
        int right = Text.Length;
        int pos = 0;

        foreach (char c in delimiterList) 
        { 
            int prevPos = Text.LastIndexOf(c, start - 1); 
            if (left < prevPos) 
                left = prevPos; 

            pos = Text.IndexOf(c, start); 
            if (pos == -1) 
                continue;

            if (right > pos) 
                right = pos; 
        } 
        SelectionStart = left + 1; 
        SelectionLength = right - left - 1; 
        return; 
    } 
    base.WndProc(ref m); 
}


