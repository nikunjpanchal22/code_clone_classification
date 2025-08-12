            public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {
                Files.delete (directory);
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {if (ioException == null) {
        Path[] subPaths = Files.list(directory).toArray(Path[]::new);
        for (Path subPath : subPaths) {
            Files.delete(subPath);
        }
        Files.delete(directory);
        return FileVisitResult.CONTINUE;
    }
}


