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
    int [] rect;
    try {
        rect = GetWindowRect.getRect (windowName);
        int x1 = rect[0];
        int y1 = rect[1];
        int x2 = rect[2];
        int y2 = rect[3];
        System.out.println ("The corner locations for the window \"" + windowName + "\" are:");
        System.out.printf ("Upper left corner: X: %d, Y: %d  ", x1, y1);
        System.out.printf ("Lower right corner: X: %d, Y: %d", x2, y2);
    } catch (GetWindowRect.WindowNotFoundException e) {
        e.printStackTrace ();
    } catch (GetWindowRect.GetWindowRectException e) {
        e.printStackTrace ();
    }
}


