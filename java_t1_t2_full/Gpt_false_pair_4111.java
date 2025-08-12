public void draw (Graphics2D g) {
    float arrowRatio = 0.5f;
    float arrowLength = 80.0f;
    BasicStroke stroke = (BasicStroke) g.getStroke ();
    float endX = 350.0f;
    float veeX;
    switch (stroke.getLineJoin ()) {
        case BasicStroke.JOIN_BEVEL :
            veeX = endX - stroke.getLineWidth () * 0.25f;
            break;
        default :
        case BasicStroke.JOIN_MITER :
            veeX = endX - stroke.getLineWidth () * 0.5f / arrowRatio;
            break;
        case BasicStroke.JOIN_ROUND :
            veeX = endX - stroke.getLineWidth () * 0.5f;
            break;
    }
    Path2D.Float path = new Path2D.Float ();
    path.moveTo (veeX - arrowLength, - arrowRatio * arrowLength);
    path.lineTo (veeX, 0.0f);
    path.lineTo (veeX - arrowLength, arrowRatio * arrowLength);
    g.setColor (Color.BLUE);
    g.draw (path);
    g.setColor (Color.YELLOW);
    g.draw (new Line2D.Float (50.0f, 0.0f, veeX, 0.0f));
    g.setColor (Color.RED);
    g.draw (new Line2D.Float (50.0f, 0.0f, veeX - stroke.getLineWidth () * 0.25f, 0.0f));
}


public void draw (Graphics2D g) {
    float arrowRatio = 0.5f;
    float arrowLength = 75.0f;
    BasicStroke stroke = (BasicStroke) g.getStroke ();
    float endX = 375.0f;
    float veeX;
    switch (stroke.getLineJoin ()) {
        case BasicStroke.JOIN_BEVEL :
            veeX = endX - stroke.getLineWidth () * 0.25f;
            break;
        default :
        case BasicStroke.JOIN_MITER :
            veeX = endX - stroke.getLineWidth () * 0.5f / arrowRatio;
            break;
        case BasicStroke.JOIN_ROUND :
            veeX = endX - stroke.getLineWidth () * 0.5f;
            break;
    }
    Path2D.Float path = new Path2D.Float ();
    path.moveTo (veeX - arrowLength, - arrowRatio * arrowLength);
    path.lineTo (veeX, 0.0f);
    path.lineTo (veeX - arrowLength, arrowRatio * arrowLength);
    g.setColor (Color.BLACK);
    g.draw (path);
    g.setColor (Color.GREEN);
    g.draw (new Line2D.Float (50.0f, 0.0f, veeX, 0.0f));
    g.setColor (Color.BLUE);
    g.draw (new Line2D.Float (50.0f, 0.0f, veeX - stroke.getLineWidth () * 0.25f, 0.0f));
}
