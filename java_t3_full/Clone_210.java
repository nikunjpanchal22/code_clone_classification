public static void main (String [] args) {
    String windowName = "Document - WordPad";
    int [] rect;
    try {
        rect = GetWindowRect.getRect (windowName);
        System.out.printf ("The corner locations for the window \"%s\" are %s", windowName, Arrays.toString (rect));
    } catch (GetWindowRect.WindowNotFoundException e) {
        e.printStackTrace ();
    } catch (GetWindowRect.GetWindowRectException e) {
        e.printStackTrace ();
    }
}


 public static void main (String [] args) {
    String windowName = "Document - WordPad";
    Rectangle rectangle;
    try {
        rectangle = GetWindowRect.getRectangle (windowName);
        Line2D line1 = new Line2D.Double (rectangle.getX(), rectangle.getY(), rectangle.getX() + rectangle.getWidth(), rectangle.getY());
        Line2D line2 = new Line2D.Double (rectangle.getX(), rectangle.getY(), rectangle.getX(), rectangle.getY() + rectangle.getHeight());
        Line2D line3 = new Line2D.Double (rectangle.getX() + rectangle.getWidth(), rectangle.getY(), rectangle.getX() + rectangle.getWidth(), rectangle.getY() + rectangle.getHeight());
        Line2D line4 = new Line2D.Double (rectangle.getX(), rectangle.getY() + rectangle.getHeight(), rectangle.getX() + rectangle.getWidth(), rectangle.getY() + rectangle.getHeight());
        System.out.printf ("The corner locations for the window \"%s\", defined by four lines, are %s and %s and %s and %s.", windowName, line1.toString (), line2.toString (), line3.toString (), line4.toString ());
    } catch (GetWindowRect.WindowNotFoundException e) {
        e.printStackTrace ();
    } catch (GetWindowRect.GetWindowRectException e) {
        e.printStackTrace ();
    }
}


