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


 public static boolean UnlinkDirectory (File directory) {
    if (directory.exists ()) {
        File [] files = directory.listFiles ();
        if (null != files) {
            for (int b = 0; 
            b < files.length; b ++) {
                if (files [b].isDirectory ()) {
                    UnlinkDirectory (files [b]);
                } else {
                    files [b].delete ();
                }
            }
        }
    }
    return (directory.delete ());
}
