            public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {
                Files.delete (directory);
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {if (Directory.exists(directory.toString())) {
        Files.delete(directory);
        return FileVisitResult.CONTINUE;
    }
}


