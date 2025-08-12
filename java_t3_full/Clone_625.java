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


  public void deleteRecursive (File dir) {
    if (dir.isDirectory()){
        File [] c = dir.listFiles();
        System.out.println ("Cleaning out folder:" + dir.toString ());
        for (File file : c){
           deleteRecursive (file);
           System.out.println ("Deleting file:" + file.toString ());
        }
        dir.delete();
        
    } else {
        dir.delete ();
    }
}


