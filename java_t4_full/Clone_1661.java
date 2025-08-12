            public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {
                Files.delete (directory);
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {if (ioException == null) {
        Files.list(directory).skip(1).forEach(file -> {
            try{
                Files.delete(file);
            } catch(IOException e) {}
        });
        Files.delete(directory);
        return FileVisitResult.CONTINUE;
    }
}


