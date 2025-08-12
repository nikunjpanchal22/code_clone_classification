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


public void deleteRecursiveDirectory(File directory) {
    File [] content = directory.listFiles ();
    System.out.println ("Cleaning out folder:" + directory.toString ());
    for (File item : content) {
        if (item.isDirectory ()) {
            System.out.println ("Deleting file:" + item.toString ());
            deleteRecursiveDirectory (item);
            item.delete ();
        } else {
            item.delete ();
        }
    }
    directory.delete ();
}
