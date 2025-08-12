protected override void WndProc (ref Message message) {
    base.WndProc (ref message);
    if (message.Msg == 0x84) {
        var cursor = this.PointToClient (Cursor.Position);
        if (TopLeft.Contains (cursor))
            message.Result = (IntPtr) HTTOPLEFT;
        else if (TopRight.Contains (cursor))
            message.Result = (IntPtr) HTTOPRIGHT;
        else if (BottomLeft.Contains (cursor))
            message.Result = (IntPtr) HTBOTTOMLEFT;
        else if (BottomRight.Contains (cursor))
            message.Result = (IntPtr) HTBOTTOMRIGHT;
        else if (Top.Contains (cursor))
            message.Result = (IntPtr) HTTOP;
        else if (Left.Contains (cursor))
            message.Result = (IntPtr) HTLEFT;
        else if (Right.Contains (cursor))
            message.Result = (IntPtr) HTRIGHT;
        else if (Bottom.Contains (cursor))
            message.Result = (IntPtr) HTBOTTOM;
    }
}


 
protected override void WndProc (ref Message message) {
    base.WndProc (ref message);
    if (message.Msg == 0x84) {
        Point currCursor = this.PointToClient (Cursor.Position);
        
        if (TopLeft.Contains(currCursor))
            message.Result = (IntPtr) HTTOPLEFT;
        else if (TopRight.Contains(currCursor))
            message.Result = (IntPtr) HTTOPRIGHT;
        else if (BottomLeft.Contains(currCursor))
            message.Result = (IntPtr) HTBOTTOMLEFT;
        else if (BottomRight.Contains(currCursor))
            message.Result = (IntPtr) HTBOTTOMRIGHT;
        else if (Top.Contains(currCursor))
            message.Result = (IntPtr) HTTOP;
        else if (Left.Contains(currCursor))
            message.Result = (IntPtr) HTLEFT;
        else if (Right.Contains(currCursor))
            message.Result = (IntPtr) HTRIGHT;
        else if (Bottom.Contains(currCursor))
            message.Result = (IntPtr) HTBOTTOM;
    }
}
