            public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {
                Files.delete (directory);
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {if (ioException == null) {
        try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(directory)) {
            for (Path subPath : dirStream) {
                Files.delete(subPath);
            }
            Files.delete(directory);
            return FileVisitResult.CONTINUE;
        }
    }
}


