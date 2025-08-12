public void mouseDragged (MouseEvent e) {
    JViewport vport = (JViewport) e.getSource ();
    JComponent label = (JComponent) vport.getView ();
    Point cp = e.getPoint ();
    Point vp = vport.getViewPosition ();
    vp.translate (pp.x - cp.x, pp.y - cp.y);
    label.scrollRectToVisible (new Rectangle (vp, vport.getSize ()));
    pp.setLocation (cp);
}


 public void mouseDragged (MouseEvent e) {
    JViewport vp = (JViewport) e.getSource();
    JComponent comp = (JComponent) vp.getView();
    Point mouseCoordinate = e.getPoint();
    Point viewPosition = vp.getViewPosition();
    int xDifference = mouseCoordinate.x - pp.x;
    int yDifference = mouseCoordinate.y - pp.y;
    viewPosition.translate(xDifference, yDifference);
    comp.scrollRectToVisible(new Rectangle(viewPosition, vp.getSize()));
    pp.setLocation(mouseCoordinate);
}


