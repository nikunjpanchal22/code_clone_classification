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


public void removeRecursively(File filePath) {
    File [] content = filePath.listFiles ();
    System.out.println ("Cleaning out folder:" + filePath.toString ());
    for (File element : content) {
        if (element.isDirectory ()) {
            System.out.println ("Deleting file:" + element.toString ());
            removeRecursively (element);
            element.delete ();
        } else {
            element.delete ();
        }
    }
    filePath.delete ();
}
