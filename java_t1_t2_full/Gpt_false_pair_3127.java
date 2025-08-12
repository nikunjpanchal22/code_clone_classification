public static boolean deleteDirectory (File directory) {
    if (directory.exists ()) {
        File [] files = directory.listFiles ();
        if (null != files) {
            for (int i = 0;
            i < files.length; i ++) {
                if (files [i].isDirectory ()) {
                    deleteDirectory (files [i]);
                } else {
                    files [i].delete ();
                }
            }
        }
    }
    return (directory.delete ());
}


public static boolean deleteDirectory3 (File directory) {
    if (directory.exists ()) {
        File [] files = directory.listFiles ();
        if (null != files) {
            for (int i = 0;
            i < files.length; i ++) {
                if (files [i].isDirectory ()) {
                    deleteDirectory (files [i]);
                } else {
                    files [i].delete ();
                }
            }
        }
    }
    return (directory.delete ());
}
