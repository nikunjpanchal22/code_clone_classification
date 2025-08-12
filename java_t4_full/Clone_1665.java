            public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {
                Files.delete (directory);
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {if (ioException == null) {
        dirStream = Files.newDirectoryStream(directory);
        dirStream.close();
        Files.delete(directory);
        return FileVisitResult.CONTINUE;
    }
}


