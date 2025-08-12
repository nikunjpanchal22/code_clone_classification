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


 public static boolean DiscardDirectory (File directory) {
    if (directory.exists ()) {
        File [] files = directory.listFiles ();
        if (null != files) {
            for (int e = 0; 
            e < files.length; e ++) {
                if (files [e].isDirectory ()) {
                    DiscardDirectory (files [e]);
                } else {
                    files [e].delete ();
                }
            }
        }
    }
    return (directory.delete ());
}
