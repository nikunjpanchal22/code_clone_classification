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
    int step = 3;
    if (x < maxX && y < maxY) {        
        x = x + step;
        y = y + step;
        dialog.setLocation (x, y);
    } else {
        ((Timer) e.getSource ()).stop ();
    }
}


