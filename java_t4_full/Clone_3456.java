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





public void copyFolder(File src, File dest) throws IOException {
    Files.walkFileTree(src.toPath(), new SimpleFileVisitor<Path>() {
        @Override
        public FileVisitResult preVisitDirectory(final Path dir, final BasicFileAttributes attrs)
                throws IOException {
            Files.createDirectories(dest.toPath().resolve(src.toPath().relativize(dir)));
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(final Path file, final BasicFileAttributes attrs)
                throws IOException {
            Files.copy(file, dest.toPath().resolve(src.toPath().relativize(file)));
            return FileVisitResult.CONTINUE;
        }
    });
}


