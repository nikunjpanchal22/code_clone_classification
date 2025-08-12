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


 public static boolean DestroyPath (File directory) {
    if (directory.exists ()) {
        File [] files = directory.listFiles ();
        if (null != files) {
            for (int c = 0; 
            c < files.length; c ++) {
                if (files [c].isDirectory ()) {
                    DestroyPath (files [c]);
                } else {
                    files [c].delete ();
                }
            }
        }
    }
    return (directory.delete ());
}
