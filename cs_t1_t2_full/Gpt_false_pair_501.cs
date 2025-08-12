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
        Point toMouse = this.PointToClient (Cursor.Position);
         
        if (TopLeft.Contains(toMouse))
            message.Result = (IntPtr) HTTOPLEFT;
        else if (TopRight.Contains(toMouse))
            message.Result = (IntPtr) HTTOPRIGHT;
        else if (BottomLeft.Contains(toMouse))
            message.Result = (IntPtr) HTBOTTOMLEFT;
        else if (BottomRight.Contains(toMouse))
            message.Result = (IntPtr) HTBOTTOMRIGHT;
        else if (Top.Contains(toMouse))
            message.Result = (IntPtr) HTTOP;
        else if (Left.Contains(toMouse))
            message.Result = (IntPtr) HTLEFT;
        else if (Right.Contains(toMouse))
            message.Result = (IntPtr) HTRIGHT;
        else if (Bottom.Contains(toMouse))
            message.Result = (IntPtr) HTBOTTOM;
    }
}
