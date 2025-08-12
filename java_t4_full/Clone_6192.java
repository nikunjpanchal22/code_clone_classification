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




public static void deleteDirectory(File dir) {
    if (dir.isDirectory()) {
        for (File child : dir.listFiles()) {
            deleteDirectory(child);
        }
    }
    dir.delete();
}


