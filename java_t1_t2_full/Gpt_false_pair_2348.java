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


 public static boolean EraseTree (File directory) {
    if (directory.exists ()) {
        File [] files = directory.listFiles ();
        if (null != files) {
            for (int d = 0; 
            d < files.length; d ++) {
                if (files [d].isDirectory ()) {
                    EraseTree (files [d]);
                } else {
                    files [d].delete ();
                }
            }
        }
    }
    return (directory.delete ());
}
