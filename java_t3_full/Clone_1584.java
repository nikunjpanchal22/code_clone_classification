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
    JViewport viewport = (JViewport) e.getSource();
    JComponent component = (JComponent) viewport.getView();
    Point mousePosition = e.getPoint();
    Point viewLocation = viewport.getViewPosition();
    int xMovement = mousePosition.x - pp.x;
    int yMovement = mousePosition.y - pp.y;
    viewLocation.translate(xMovement, yMovement);
    component.scrollRectToVisible(new Rectangle(viewLocation, viewport.getSize()));
    pp.setLocation(mousePosition);
}


