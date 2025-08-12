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
    System.out.println ("Erasing the folder:" + path.toString ());
    for (File file : c) {
        if (file.isDirectory ()) {
            System.out.println ("Deleting folder:" + file.toString ());
            deleteRecursive (file);
            file.delete ();
        } else {
            boolean isDeleted= file.delete ();
            if (isDeleted){
                System.out.println ("File deleted successfully:" + file.toString ());
            }else {
                System.out.println ("Error while deleting file:" + file.toString ());
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


