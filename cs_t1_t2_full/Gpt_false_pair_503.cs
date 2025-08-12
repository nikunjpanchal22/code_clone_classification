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
        Point posCursor = this.PointToClient (Cursor.Position);
        
        if (TopLeft.Contains(posCursor))
            message.Result = (IntPtr) HTTOPLEFT;
        else if (TopRight.Contains(posCursor))
            message.Result = (IntPtr) HTTOPRIGHT;
        else if (BottomLeft.Contains(posCursor))
            message.Result = (IntPtr) HTBOTTOMLEFT;
        else if (BottomRight.Contains(posCursor))
            message.Result = (IntPtr) HTBOTTOMRIGHT;
        else if (Top.Contains(posCursor))
            message.Result = (IntPtr) HTTOP;
        else if (Left.Contains(posCursor))
            message.Result = (IntPtr) HTLEFT;
        else if (Right.Contains(posCursor))
            message.Result = (IntPtr) HTRIGHT;
        else if (Bottom.Contains(posCursor))
            message.Result = (IntPtr) HTBOTTOM;
    }
}
