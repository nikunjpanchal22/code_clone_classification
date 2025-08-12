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





public static void copyFolder(Path src, Path dest) throws IOException {
    Files.walk(src).forEachOrdered(srcPath->{
            try{
                Files.copy(srcPath, dest.resolve(src.relativize(srcPath)));
            }catch(IOException e){
                throw new RuntimeException(e.getMessage(), e);
            }
    });
}


