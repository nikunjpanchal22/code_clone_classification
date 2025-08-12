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





public void deleteRecursive(File path) {
    System.out.println("Deleting " + path);

    if (path.isDirectory()) {
        for (File child : path.listFiles()) {
            deleteRecursive(child);
        }
    }
    path.delete();
}


