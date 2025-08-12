            public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {
                Files.delete (directory);
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {if (ioException == null) {
        Path dirName = directory.getFileName();
        Files.walkFileTree(dirName, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                    throws IOException {
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }
            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc)
                    throws IOException {
                Files.delete(dir);
                return FileVisitResult.CONTINUE;
            }
        });
        return FileVisitResult.CONTINUE;
    }
}


