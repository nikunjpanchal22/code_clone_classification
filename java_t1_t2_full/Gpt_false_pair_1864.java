public void actionPerformed (ActionEvent e) {
    long duration = System.currentTimeMillis () - startTime;
    float progress = (float) duration / (float) RUN_TIME;
    linePoint = new Point ();
    linePoint.x = getWidth () / 2;
    if (progress < 0.5f) {
        linePoint.y = Math.round (getHeight () * (progress * 2));
    } else {
        if (progress > 1f) {
            progress = 1f;
            ((Timer) e.getSource ()).stop ();
            linePoint = null;
            ballPoint = null;
        } else {
            linePoint.y = Math.round (getHeight () * (progress * 2));
            linePoint.y = getHeight () - (linePoint.y - getHeight ());
            ballPoint.y = linePoint.y;
        }
    }
    repaint ();
}


 public void actionPerformed (ActionEvent e) {
    long duration = System.currentTimeMillis () - startTime;
    float progress = (float) duration / (float) RUN_TIME;
    linePoint = new Point ();
    linePoint.x = getWidth () / 2;
    if (progress<0.5f) {
        linePoint.y = (int) (progress * getHeight());
    } else {
        if (progress>1f) {
            progress = 1f;
            linePoint = null;
            ballPoint = null;
            ((Timer) e.getSource ()).stop ();
        } else {
            linePoint.y = getHeight() - (int) ((progress-0.5f) * getHeight());
            ballPoint.y = linePoint.y;
        }
    }
    repaint ();
} 
