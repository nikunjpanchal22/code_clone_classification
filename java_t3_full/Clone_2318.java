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






public void actionPerformed(ActionEvent event) {
    int maxX = scrn.width - dialog.getWidth();
    int maxY = scrn.height - dialog.getHeight();
    if(x >= maxX || y >= maxY) {
        ((Timer) event.getSource()).stop();
    }else{
        x++;
        y++;
        dialog.setLocation(x, y);
    }
}


