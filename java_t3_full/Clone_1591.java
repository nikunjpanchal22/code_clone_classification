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
    Point clickPoint = e.getPoint();
    Point currentPoint = vport.getViewPosition();
    int shiftX = clickPoint.x - pp.x;
    int shiftY = clickPoint.y - pp.y;
    currentPoint.translate(shiftX, shiftY);
    label.scrollRectToVisible(new Rectangle(currentPoint, vport.getSize()));
    pp.setLocation(clickPoint);
}


