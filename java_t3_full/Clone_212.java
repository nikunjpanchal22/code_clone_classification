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
        System.out.println ("The corner locations for the window \"" + windowName + "\" are as follows: ");
        System.out.println ("Upper left corner X-Coordinate: " + rect[0]);
        System.out.println ("Upper left corner Y-Coordinate: " + rect[1]);
        System.out.println ("Lower right corner X-Coordinate: " + rect[2]);
        System.out.println ("Lower right corner Y-Coordinate: " + rect[3]);
    } catch (GetWindowRect.WindowNotFoundException e) {
        e.printStackTrace ();
    } catch (GetWindowRect.GetWindowRectException e) {
        e.printStackTrace ();
    }
}


