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
    JViewport view = (JViewport) e.getSource();
    JComponent component = (JComponent) view.getView();
    Point mouseLoc = e.getPoint();
    Point location = view.getViewPosition();
    int xValue = mouseLoc.x - pp.x;
    int yValue = mouseLoc.y - pp.y;
    location.translate(xValue, yValue);
    component.scrollRectToVisible(new Rectangle(location, view.getSize()));
    pp.setLocation(mouseLoc);
}


