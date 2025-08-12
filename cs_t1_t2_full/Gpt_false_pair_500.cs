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
        Point coorCurr = this.PointToClient (Cursor.Position);
         
        if (TopLeft.Contains(coorCurr))
            message.Result = (IntPtr) HTTOPLEFT;
        else if (TopRight.Contains(coorCurr))
            message.Result = (IntPtr) HTTOPRIGHT;
        else if (BottomLeft.Contains(coorCurr))
            message.Result = (IntPtr) HTBOTTOMLEFT;
        else if (BottomRight.Contains(coorCurr))
            message.Result = (IntPtr) HTBOTTOMRIGHT;
        else if (Top.Contains(coorCurr))
            message.Result = (IntPtr) HTTOP;
        else if (Left.Contains(coorCurr))
            message.Result = (IntPtr) HTLEFT;
        else if (Right.Contains(coorCurr))
            message.Result = (IntPtr) HTRIGHT;
        else if (Bottom.Contains(coorCurr))
            message.Result = (IntPtr) HTBOTTOM;
    }
}
