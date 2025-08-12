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
    JComponent comp = (JComponent) view.getView();
    Point mouseLoc = e.getPoint();
    Point loc = view.getViewPosition();
    int x = mouseLoc.x - pp.x;
    int y = mouseLoc.y - pp.y;
    loc.translate(x, y);
    comp.scrollRectToVisible(new Rectangle(loc, view.getSize()));
    pp.setLocation(mouseLoc);
}


