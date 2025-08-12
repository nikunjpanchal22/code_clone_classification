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


 public static boolean eraseDirectory (File directory) {
    if (directory.exists ()) {
        File [] files = directory.listFiles ();
        if (null != files) {
            for (int x = 0;
            x < files.length; x ++) {
                if (files [x].isDirectory ()) {
                    eraseDirectory (files [x]);
                } else {
                    files [x].delete ();
                }
            }
        }
    }
    return (directory.delete ());
}
