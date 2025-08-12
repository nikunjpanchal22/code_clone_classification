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
    JViewport viewPoint = (JViewport) e.getSource();
    JComponent compnt = (JComponent) viewPoint.getView();
    Point mouseP = e.getPoint();
    Point viewPos = viewPoint.getViewPosition();
    int xDist = mouseP.x - pp.x;
    int yDist = mouseP.y - pp.y;
    viewPos.translate(xDist, yDist);
    compnt.scrollRectToVisible(new Rectangle(viewPos, viewPoint.getSize()));
    pp.setLocation(mouseP);
}


