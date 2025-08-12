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
        Point moveCursor = this.PointToClient (Cursor.Position);
         
        if (TopLeft.Contains(moveCursor))
            message.Result = (IntPtr) HTTOPLEFT;
        else if (TopRight.Contains(moveCursor))
            message.Result = (IntPtr) HTTOPRIGHT;
        else if (BottomLeft.Contains(moveCursor))
            message.Result = (IntPtr) HTBOTTOMLEFT;
        else if (BottomRight.Contains(moveCursor))
            message.Result = (IntPtr) HTBOTTOMRIGHT;
        else if (Top.Contains(moveCursor))
            message.Result = (IntPtr) HTTOP;
        else if (Left.Contains(moveCursor))
            message.Result = (IntPtr) HTLEFT;
        else if (Right.Contains(moveCursor))
            message.Result = (IntPtr) HTRIGHT;
        else if (Bottom.Contains(moveCursor))
            message.Result = (IntPtr) HTBOTTOM;
    }
}
