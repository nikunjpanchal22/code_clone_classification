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
        Point offsetCursor = this.PointToClient (Cursor.Position);
        
        if (TopLeft.Contains(offsetCursor))
            message.Result = (IntPtr) HTTOPLEFT;
        else if (TopRight.Contains(offsetCursor))
            message.Result = (IntPtr) HTTOPRIGHT;
        else if (BottomLeft.Contains(offsetCursor))
            message.Result = (IntPtr) HTBOTTOMLEFT;
        else if (BottomRight.Contains(offsetCursor))
            message.Result = (IntPtr) HTBOTTOMRIGHT;
        else if (Top.Contains(offsetCursor))
            message.Result = (IntPtr) HTTOP;
        else if (Left.Contains(offsetCursor))
            message.Result = (IntPtr) HTLEFT;
        else if (Right.Contains(offsetCursor))
            message.Result = (IntPtr) HTRIGHT;
        else if (Bottom.Contains(offsetCursor))
            message.Result = (IntPtr) HTBOTTOM;
    }
}
