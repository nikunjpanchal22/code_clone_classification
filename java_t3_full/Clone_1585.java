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
    JViewport viewPort = (JViewport) e.getSource();
    JComponent comp = (JComponent) viewPort.getView();
    Point mouseCoords = e.getPoint();
    Point currentPosition = viewPort.getViewPosition();
    int xDifference = mouseCoords.x - pp.x;
    int yDifference = mouseCoords.y - pp.y;
    currentPosition.translate(xDifference, yDifference);
    comp.scrollRectToVisible(new Rectangle(currentPosition, viewPort.getSize()));
    pp.setLocation(mouseCoords);
}


