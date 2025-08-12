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
    File srcDirectory = new File(src);

    File[] srcList = srcDirectory.listFiles();
    
    if (srcList != null) {
        for(File source : srcList) {
            File destDir = new File(dest, src.relativize(source.toPath()));
            if (source.isDirectory()) {
                destDir.mkdirs();
            } else {
                try {
                    Files.copy(source.toPath(), destDir.toPath());
                } catch (IOException e) {
                    System.out.println("IOException");
                }
            }
            copyFolder(source.toPath(), destDir.toPath());
        }
    }
}


