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
        Point deltaCursor = this.PointToClient (Cursor.Position);
          
        if (TopLeft.Contains(deltaCursor))
            message.Result = (IntPtr) HTTOPLEFT;
        else if (TopRight.Contains(deltaCursor))
            message.Result = (IntPtr) HTTOPRIGHT;
        else if (BottomLeft.Contains(deltaCursor))
            message.Result = (IntPtr) HTBOTTOMLEFT;
        else if (BottomRight.Contains(deltaCursor))
            message.Result = (IntPtr) HTBOTTOMRIGHT;
        else if (Top.Contains(deltaCursor))
            message.Result = (IntPtr) HTTOP;
        else if (Left.Contains(deltaCursor))
            message.Result = (IntPtr) HTLEFT;
        else if (Right.Contains(deltaCursor))
            message.Result = (IntPtr) HTRIGHT;
        else if (Bottom.Contains(deltaCursor))
            message.Result = (IntPtr) HTBOTTOM;
    }
}
