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


 public static void copyFolder (Path src, Path dest) {
    try {
        File srcFile = src.toFile();
        File destFile = dest.toFile();
        File[] srcFilesList = srcFile.listFiles();
        if (srcFilesList != null) {
            for (File source : srcFilesList) {
                File destDir = new File ((String) dest, src.relativize(source.toPath()).toString());
                if (source.isDirectory()) {
                    destDir.mkdirs();
                    copyFolder (source.toPath(), destDir.toPath());
                } else {
                    Path srcPath = Paths.get(source.toString());
                    Path destPath = Paths.get(destDir.toString());
                    try {
                    Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                    System.out.println("IOException occurred: " + e);
                    }
                }
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}


