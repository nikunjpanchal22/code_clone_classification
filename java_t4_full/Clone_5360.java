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
    linePoint = new Point();
    linePoint.x = getWidth() / 2;
    timer = (Timer)e.getSource();
    long timeElapsed = System.currentTimeMillis() - startTime;
    float progress = timeElapsed / RUN_TIME;

    switch (progress > 1 ? 2 : progress < 0.5f ? 0 : 1) {
        case 0: linePoint.y = Math.round(getHeight() * progress * 2); break;
        case 1:
            linePoint.y = getHeight() - Math.round(getHeight() * progress * 2 - getHeight());
            ballPoint.y = linePoint.y;
            break;
        case 2:
            progress = 1;
            timer.stop();
            linePoint = ballPoint = null;
            break;
    }
    repaint();
}


