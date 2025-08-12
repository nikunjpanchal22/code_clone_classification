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
    File[] list = path.listFiles();
    for(int i = 0; i < list.length; i++) {
        if(list[i].isDirectory()){
            deleteRecursive (list[i]);
        }
        list[i].delete();
    }
    path.delete ();
    System.out.println ("Deleting folder:" + path.toString ());
}


