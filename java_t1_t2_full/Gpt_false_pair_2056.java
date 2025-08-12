public void draw (Graphics2D g) {
    float arrowRatio = 0.5f;
    float arrowLength = 80.0f;
    BasicStroke stroke = (BasicStroke) g.getStroke ();
    float endX = 350.0f;
    float veeX = endX - stroke.getLineWidth () * 0.5f / arrowRatio;
    Path2D.Float path = new Path2D.Float ();
    float waisting = 0.5f;
    float waistX = endX - arrowLength * 0.5f;
    float waistY = arrowRatio * arrowLength * 0.5f * waisting;
    float arrowWidth = arrowRatio * arrowLength;
    path.moveTo (veeX - arrowLength, - arrowWidth);
    path.quadTo (waistX, - waistY, endX, 0.0f);
    path.quadTo (waistX, waistY, veeX - arrowLength, arrowWidth);
    path.lineTo (veeX - arrowLength * 0.75f, 0.0f);
    path.lineTo (veeX - arrowLength, - arrowWidth);
    g.setColor (Color.BLUE);
    g.fill (path);
    g.setColor (Color.RED);
    g.draw (new Line2D.Float (50.0f, 0.0f, veeX - arrowLength * 0.5f, 0.0f));
}


 public void draw (Graphics2D g) { float arrowRatio = 0.2f;
    float arrowLength = 190.0f;
    BasicStroke stroke = (BasicStroke) g.getStroke ();
    float endX = 450.0f;
    float veeX = endX - stroke.getLineWidth () * 0.5f / arrowRatio;
    Path2D.Float path = new Path2D.Float ();
    float waisting = 0.5f;
    float waistX = endX - arrowLength * 0.5f;
    float waistY = arrowRatio * arrowLength * 0.5f * waisting;
    float arrowWidth = arrowRatio * arrowLength;
    path.moveTo (veeX - arrowLength, - arrowWidth);
    path.quadTo (waistX, - waistY, endX, 0.0f);
    path.quadTo (waistX, waistY, veeX - arrowLength, arrowWidth);
    path.lineTo (veeX - arrowLength * 0.75f, 0.0f);
    path.lineTo (veeX - arrowLength, - arrowWidth);
    g.setColor (Color.DARK_GRAY);
    g.fill (path);
    g.setColor (Color.LIGHT_GRAY);
    g.draw (new Line2D.Float (70.0f, 0.0f, veeX - arrowLength * 0.5f, 0.0f));
}
