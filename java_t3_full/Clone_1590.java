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
    JViewport vport = (JViewport) e.getSource();
    JComponent label = (JComponent) vport.getView();  
    Point mouseCursor = e.getPoint();
    Point displayLocation = vport.getViewPosition();
    int xDifference = mouseCursor.x - pp.x;
    int yDifference = mouseCursor.y - pp.y;
    displayLocation.translate(xDifference, yDifference);
    label.scrollRectToVisible(new Rectangle(displayLocation, vport.getSize()));
    pp.setLocation(mouseCursor);
}


