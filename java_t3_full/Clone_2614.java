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
    switch (xpos < 0 ? -1 : 1) {
      case -1: 
        polyrot--; 
        break; 
      default: 
        polyrot++; 
    }
    repaint();
} 


