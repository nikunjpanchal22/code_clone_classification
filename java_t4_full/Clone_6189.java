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
    for(File file : Objects.requireNonNull(dir.listFiles())) {
        if(file.isDirectory()) {
            deleteDirectory(file);
        } else {
            file.delete();
        }
    }
    dir.delete();
}


