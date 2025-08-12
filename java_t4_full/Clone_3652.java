public void mouseMoved (MouseEvent e) {
    xpos = getX ();
    if (xpos < 0) {
        polyrot --;
    } else if (xpos > 0) {
        polyrot ++;
    }
    repaint ();
    break;
}






public void mouseMoved (MouseEvent e) {
    xpos = getX(); 
    polyrot = xpos < 0 ? polyrot - 1 : polyrot + 1; 
    repaint();
}


