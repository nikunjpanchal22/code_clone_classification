public void deleteRecursive (File path) {
    File [] c = path.listFiles ();
    System.out.println ("Cleaning out folder:" + path.toString ());
    for (File file : c) {
        if (file.isDirectory ()) {
            System.out.println ("Deleting file:" + file.toString ());
            deleteRecursive (file);
            file.delete ();
        } else {
            file.delete ();
        }
    }
    path.delete ();
}





public void deleteRecursive (File path) {
    File [] files = path.listFiles();
    int len = files.length;
    for (int i = 0; i < len; i++) {
        if (files[i].isDirectory ()) {
            deleteRecursive (files[i]);
        }
        files[i].delete ();
    }
    path.delete ();
}


