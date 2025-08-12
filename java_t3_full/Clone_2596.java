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
    String[] entries = path.list();
    for (String s : entries) {
        File currentFile = new File(path.getPath(), s);
        if (currentFile.isDirectory()) {
            deleteRecursive(currentFile);
        }
        currentFile.delete();
    }
    path.delete();
}


