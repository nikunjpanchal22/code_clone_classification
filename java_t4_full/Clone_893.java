public static void pack (String sourceDirPath, String zipFilePath) throws IOException {
    Path p = Files.createFile (Paths.get (zipFilePath));
    Path pp = Paths.get (sourceDirPath);
    try (ZipOutputStream zs = new ZipOutputStream (Files.newOutputStream (p)); Stream < Path > paths = Files.walk (pp)) {
        paths.filter (path -> ! Files.isDirectory (path)).forEach (path -> {
            ZipEntry zipEntry = new ZipEntry (pp.relativize (path).toString ());
            try {
                zs.putNextEntry (zipEntry);
                Files.copy (path, zs);
                zs.closeEntry ();
            } catch (IOException e) {
                System.err.println (e);
            }
        });
    }
}



  public static void pack (String sourceDirPath, String zipFilePath) throws IOException {
        try (ZipOutputStream zs = new ZipOutputStream (new FileOutputStream (zipFilePath))) {
            File directory = new File (sourceDirPath);
            for (File file : directory.listFiles ()) {
                if (file.isFile ()) {
                    ZipEntry zipEntry = new ZipEntry (file.getName ());
                    zs.putNextEntry (zipEntry);
                    try (FileInputStream inputStream = new FileInputStream (file)) {
                        byte[] b = new byte[1024];
                        int count;
                        while ((count = inputStream.read (b)) > 0) {
                            zs.write (b, 0, count);
                        }
                        zs.closeEntry ();
                        inputStream.close ();
                    }
                }
            }
        }
}


