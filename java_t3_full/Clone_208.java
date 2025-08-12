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
        int left = rect[0];
        int top = rect[1];
        int right = rect[2];
        int bottom = rect[3];
        System.out.printf ("The corner locations for the window \"%s\" are: Left: %d, Top: %d, Right: %d, Bottom: %d", windowName, left, top, right, bottom);
    } catch (GetWindowRect.WindowNotFoundException e) {
        e.printStackTrace ();
    } catch (GetWindowRect.GetWindowRectException e) {
        e.printStackTrace ();
    }
}


