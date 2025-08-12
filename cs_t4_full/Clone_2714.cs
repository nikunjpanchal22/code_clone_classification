public bool PreFilterMessage (ref Message m) {
    if (m.Msg != 0x20a)
        return false;
    Point mouseAbsolutePosition = new Point (m.LParam.ToInt32 ());
    Point mouseRelativePosition = mCtrl.PointToClient (mouseAbsolutePosition);
    IntPtr hControlUnderMouse = WindowFromPoint (mouseAbsolutePosition);
    Control controlUnderMouse = Control.FromHandle (hControlUnderMouse);
    if (controlUnderMouse != mCtrl)
        return false;
    MouseButtons buttons = GetMouseButtons (m.WParam.ToInt32 ());
    int delta = m.WParam.ToInt32 () > > 16;
    var e = new MouseEventArgs (buttons, 0, mouseRelativePosition.X, mouseRelativePosition.Y, delta);
    mOnMouseWheel (e);
    return true;
}





public bool PreFilterMessage(ref Message m) {
   var isMessageMatched = m.Msg == 0x20a;
   if (!isMessageMatched) return false;
   var mouseAbsolutePosition = new Point(m.LParam.ToInt32());
   if (BuildControlFromPoint(mouseAbsolutePosition) != mCtrl)  return false;
   var mouseEventArgs = BuildMouseEventArgs(m, mouseAbsolutePosition);
   mOnMouseWheel(mouseEventArgs);
   return true;
}


