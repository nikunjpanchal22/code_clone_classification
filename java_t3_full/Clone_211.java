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
        int x = (int) rectangle.getX ();
        int y = (int) rectangle.getY ();
        int width = (int) rectangle.getWidth ();
        int height = (int) rectangle.getHeight ();
        System.out.printf ("The corner locations for the window \"%s\" are: X: %d, Y: %d, Width: %d, Height: %d", windowName, x, y, width, height);
    } catch (GetWindowRect.WindowNotFoundException e) {
        e.printStackTrace ();
    } catch (GetWindowRect.GetWindowRectException e) {
        e.printStackTrace ();
    }
}


