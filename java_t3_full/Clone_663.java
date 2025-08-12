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
   Point mousePosition = e.getPoint();
   int x = mousePosition.x;
   if (x < 0) {
        polyrot--;
    } else if (x > 0) {
        polyrot++;
    }
    repaint();
    return;
}


