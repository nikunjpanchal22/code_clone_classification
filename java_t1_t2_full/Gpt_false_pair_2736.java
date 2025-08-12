public static void listFilesForFolder (final File folder) {
    for (final File fileEntry : folder.listFiles ()) {
        if (fileEntry.isDirectory ()) {
            listFilesForFolder (fileEntry);
        } else {
            System.out.println (fileEntry.getName ());
        }
    }
}


 public static void displayFolderContent (final File folder) {
    for (final File fileEntry : folder.listFiles()) {
           if (fileEntry.isDirectory()) {
               displayFolderContent (fileEntry);
           } else {
               System.out.println (fileEntry.getName());
           }
       }
}
