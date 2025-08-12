            public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {
                Files.delete (directory);
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {if (Files.isDirectory(directory, LinkOption.NOFOLLOW_LINKS)) {
        Files.delete(directory);
        return FileVisitResult.CONTINUE;
    }
}


