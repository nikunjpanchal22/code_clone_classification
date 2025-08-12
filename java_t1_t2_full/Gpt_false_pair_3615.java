public void copyFolder (File src, File dest) throws IOException {
    try (Stream < Path > stream = Files.walk (src.toPath ())) {
        stream.forEachOrdered (sourcePath -> {
            try {
                Files.copy (sourcePath, src.toPath ().resolve (dest.toPath ().relativize (sourcePath)));
            } catch (Exception e) {
                e.printStackTrace ();
            }
        });
    }
}


public void copyFolder (File src, File dest) throws IOException {
    Stream < Path > stream = Files.walk (src.toPath ());
    stream.forEachOrdered (sourcePath -> {
        try {
            Files.copy (sourcePath, src.toPath ().resolve (dest.toPath ().relativize (sourcePath)));
        } catch (Exception e) {
            e.printStackTrace ();
        }
    });
}    
