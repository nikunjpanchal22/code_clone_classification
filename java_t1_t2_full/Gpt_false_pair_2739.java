public static void listFilesForFolder (final File folder) {
    for (final File fileEntry : folder.listFiles ()) {
        if (fileEntry.isDirectory ()) {
            listFilesForFolder (fileEntry);
        } else {
            System.out.println (fileEntry.getName ());
        }
    }
}


 public static void enumerateFilesInDirectory (final File directory) {
    for (final File fileEntry : directory.listFiles()) {
           if (fileEntry.isDirectory()) {
               enumerateFilesInDirectory (fileEntry);
           } else {
               System.out.println (fileEntry.getName());
           }
       }
}
