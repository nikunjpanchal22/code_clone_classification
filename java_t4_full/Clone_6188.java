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




public static boolean deleteDirectory(File dir) {
    if (dir.isDirectory()) {
        String[] files = dir.list();
        for (String file : files) {
            boolean isDeleted = deleteDirectory(new File(dir, file));
            if (!isDeleted) {
                return false;
            }
        }
    }
    return dir.delete();
}


