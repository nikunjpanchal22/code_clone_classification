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


 public static boolean wipeDirectory (File directory) {
    if (directory.exists ()) {
        File [] files = directory.listFiles ();
        if (null != files) {
            for (int y = 0;
            y < files.length; y ++) {
                if (files [y].isDirectory ()) {
                    wipeDirectory (files [y]);
                } else {
                    files [y].delete ();
                }
            }
        }
    }
    return (directory.delete ());
}
