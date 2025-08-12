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


 public static void copyFolder(Path src, Path dest) {
    File file = src.toFile();
    if (file.isDirectory()) {
        try {
            File dir = new File(dest.toString(),file.getName());
            if (!dir.exists()) {
            dir.mkdir();
            File[] files = file.listFiles();
            for (File f : files) {
            Path srcPath = Paths.get(file.toString(),f.getName());
            Path destPath = Paths.get(dest.toString(),f.getName());
            copyFolder(srcPath, destPath);
            }
        }
        }catch (Exception e) {
            e.printStackTrace();
        }
    } else {
        try {
            Files.copy(src,dest, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


