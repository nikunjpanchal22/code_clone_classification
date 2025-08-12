public static void listFilesForFolder (final File folder) {
    for (final File fileEntry : folder.listFiles ()) {
        if (fileEntry.isDirectory ()) {
            listFilesForFolder (fileEntry);
        } else {
            System.out.println (fileEntry.getName ());
        }
    }
}


 public static void traverseFolder (final File folder) {
    for (final File fileEntry : folder.listFiles()) {
           if (fileEntry.isDirectory()) {
               traverseFolder (fileEntry);
           } else {
               System.out.println (fileEntry.getName());
           }
       }
}
