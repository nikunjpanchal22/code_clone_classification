public void actionPerformed (ActionEvent e) {
    int maxX = scrn.width - dialog.getWidth ();
    int maxY = scrn.height - dialog.getHeight ();
    if (x < maxX && y < maxY) {
        x ++;
        y ++;
        dialog.setLocation (x, y);
    } else {
        ((Timer) e.getSource ()).stop ();
    }
}


 public void actionPerformed (ActionEvent e) {
int maxX = scrn.width - dialog.getWidth ();
    int maxY = scrn.height - dialog.getHeight ();
    double step = 0.2;
    if (x < maxX && y < maxY) {        
        x = (int) (x + step);
        y = (int) (y + step);
        dialog.setLocation (x, y);
    } else {
        ((Timer) e.getSource ()).stop ();
    }
}


