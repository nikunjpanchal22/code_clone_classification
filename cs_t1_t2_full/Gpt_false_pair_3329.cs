private Point GetLocationRelativeToForm (Control c) {
    Point controlLocationRelativeToForm1 = new Point ();
    Control currentControl = c;
    while (currentControl.Parent != null) {
        controlLocationRelativeToForm1.Offset (currentControl.Left, currentControl.Top);
        currentControl = currentControl.Parent;
    }
    Point controlScreenPoint = c.PointToScreen (Point.Empty);
    Point formScreenPoint = PointToScreen (Point.Empty);
    Point controlLocationRelativeToForm2 = controlScreenPoint - new Size (formScreenPoint);
    Point locationOnForm = c.FindForm ().PointToClient (c.Parent.PointToScreen (c.Location));
    Debug.Assert (controlLocationRelativeToForm1 == controlLocationRelativeToForm2);
    Debug.Assert (locationOnForm == controlLocationRelativeToForm1);
    Debug.Assert (locationOnForm == controlLocationRelativeToForm2);
    return controlLocationRelativeToForm1;
}


private Point GetLocationRelativeToForm (Control c) {
    Point controlLocationRelativeToForm1 = new Point ();
    Control parentControl = c;
    while (parentControl.Parent != null) {
        controlLocationRelativeToForm1.Offset (parentControl.Left, parentControl.Top);
        parentControl = parentControl.Parent;
    }
    Point controlScreenPoint = c.PointToScreen (Point.Empty);
    Point formScreenPoint = PointToScreen (Point.Empty);
    Point controlLocationRelativeToForm2 = controlScreenPoint - new Size (formScreenPoint);
    Point controlLocationOnForm = c.FindForm ().PointToClient (c.Parent.PointToScreen (c.Location));
    Debug.Assert (controlLocationRelativeToForm1 == controlLocationRelativeToForm2);
    Debug.Assert (controlLocationOnForm == controlLocationRelativeToForm1);
    Debug.Assert (controlLocationOnForm == controlLocationRelativeToForm2);
    return controlLocationRelativeToForm1;
}
