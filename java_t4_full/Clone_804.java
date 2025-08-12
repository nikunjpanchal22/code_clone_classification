public static void copyFolder (Path src, Path dest) {
    try {
        Files.walk (src).forEach (s -> {
            try {
                Path d = dest.resolve (src.relativize (s));
                if (Files.isDirectory (s)) {
                    if (! Files.exists (d)) Files.createDirectory (d);
                    return;
                }
                Files.copy (s, d);
            } catch (Exception e) {
                e.printStackTrace ();
            }
        });
    } catch (Exception ex) {
        ex.printStackTrace ();
    }
}


 public static void copyFolder(Path src, Path dest)
{
     try
     {
         List<Path> files = Files.walk(src)
                            .collect(Collectors.toList());
         for(Path file : files)
         {
             if(Files.isDirectory(file))
             {
                 Path newDir = dest.resolve(src.relativize(file));
                 if(Files.notExists(newDir))
                     Files.createDirectory(newDir);
             }
             else
             {
                 Path newFile = dest.resolve(src.relativize(file));
                 Files.copy(file, newFile, StandardCopyOption.REPLACE_EXISTING);
             }
         }
     } catch (IOException e)
     {
         System.err.println("IOException occurred: " + e.getMessage());
     }
}


