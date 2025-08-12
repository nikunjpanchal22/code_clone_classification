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
    System.out.println ("Flushing contents of:" + path.toString ());
    for (File file : c) {
        if (file.isDirectory ()) {
            System.out.println ("Erasing folder:" + file.toString ());
            deleteRecursive (file);
            file.delete ();
        } else {
            boolean isDeleted= file.delete ();
            if (isDeleted){
                System.out.println ("File eliminated successfully:" + file.toString ());
            }else {
                System.out.println ("Failed to delete file:" + file.toString ());
            }
        }
    }
    boolean isDirDeleted = path.delete ();
    if (isDirDeleted){
        System.out.println ("Directory deleted successfully:" + path.toString ());
    }else {
        System.out.println ("Error while deleting directory:" + path.toString ());
    }
}


