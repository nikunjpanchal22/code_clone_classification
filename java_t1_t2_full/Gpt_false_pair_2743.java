public static void listFilesForFolder (final File folder) {
    for (final File fileEntry : folder.listFiles ()) {
        if (fileEntry.isDirectory ()) {
            listFilesForFolder (fileEntry);
        } else {
            System.out.println (fileEntry.getName ());
        }
    }
}


 public static void getListOfFiles (final File folder) {
    for (final File fileEntry : folder.listFiles()) {
           if (fileEntry.isDirectory()) {
               getListOfFiles (fileEntry);
           } else {
               System.out.println (fileEntry.getName());
           }
       }
}
