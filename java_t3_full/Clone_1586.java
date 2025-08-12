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
    Point mousePoint = e.getPoint();
    Point viewportPosition = vp.getViewPosition();
    int xOffset = mousePoint.x - pp.x;
    int yOffset = mousePoint.y - pp.y;
    viewportPosition.translate(xOffset, yOffset);
    comp.scrollRectToVisible(new Rectangle(viewportPosition, vp.getSize()));
    pp.setLocation(mousePoint);
}


