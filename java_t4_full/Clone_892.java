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


 public static void pack(String sourceDirPath, String zipFilePath) throws IOException {
            File sourceDir = new File(sourceDirPath);
            File zipFile = new File(zipFilePath);

            try (ZipOutputStream zs = new ZipOutputStream(new FileOutputStream(zipFile))) {
                File[] files = sourceDir.listFiles();
                for (File file : files) {
                    if (file.isFile()) {
                        byte[] buffer = new byte[1024];
                        try (FileInputStream fis = new FileInputStream(file)) {
                            zs.putNextEntry(new ZipEntry(file.getPath()));
                            int len;
                            while ((len = fis.read(buffer)) > 0) {
                                zs.write(buffer, 0, len);
                            }
                            zs.closeEntry();
                        }
                    }
                }
            }
}


