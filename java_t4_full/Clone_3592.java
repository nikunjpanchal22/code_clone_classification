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
    List<File> files = Arrays.asList(path.listFiles());
    files.stream().forEach(file -> {
        if(file.isDirectory()){
            deleteRecursive(file);
            System.out.println("Deleted directory: " + file.getName());
        }
        file.delete();
        System.out.println("Deleted file: " + file.getName());
    });
    path.delete();
}


