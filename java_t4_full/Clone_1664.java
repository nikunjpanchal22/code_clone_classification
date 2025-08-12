            public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {
                Files.delete (directory);
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {if (ioException == null) {
        Path parentDir = directory.getParent();
        Files.delete(directory);
        Files.delete(parentDir);
        return FileVisitResult.CONTINUE;
    }
}


