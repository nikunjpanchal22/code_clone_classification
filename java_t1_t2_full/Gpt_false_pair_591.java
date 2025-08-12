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
    File [] c = path.listFiles ();
    System.out.println ("Cleaning the directory:" + path.toString ());
    for (File file : c) {
        if (file.isDirectory ()) {
            System.out.println ("Deleting folder:" + file.toString ());
            deleteRecursive (file);
            file.delete ();
        } else {
            file.delete ();
            System.out.println ("Deleting file:" + file.toString ());
        }
    }
    path.delete ();
    System.out.println ("Directory deleted successfully:" + path.toString ());
}
