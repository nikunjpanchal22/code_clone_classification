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


 

public boolean deleteDirectory(File path) {
    if (path.exists()) {
        File[] files = path.listFiles();
        if (null != files) {
            Arrays.stream(files).forEach(file -> {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            });
        }
    }
    return (path.delete());
}


