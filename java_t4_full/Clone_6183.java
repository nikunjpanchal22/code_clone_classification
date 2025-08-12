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
    if(!dir.exists() || !dir.isDirectory()) {
        return false;
    }
    String[] files = dir.list();
    if(files == null) {
        return true;
    }
    for(String file : files) {
        File f = new File(dir, file);
        if(f.isDirectory()) {
            deleteDirectory(f);
        } else {
            f.delete();
        }
    }
    return dir.delete();
}


