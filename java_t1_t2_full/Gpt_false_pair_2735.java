public static void listFilesForFolder (final File folder) {
    for (final File fileEntry : folder.listFiles ()) {
        if (fileEntry.isDirectory ()) {
            listFilesForFolder (fileEntry);
        } else {
            System.out.println (fileEntry.getName ());
        }
    }
}


 public static void showFilesInFolder (final File folder) {
    for (final File fileEntry : folder.listFiles()) {
           if (fileEntry.isDirectory()) {
               showFilesInFolder (fileEntry);
           } else {
               System.out.println (fileEntry.getName());
           }
       }
}
