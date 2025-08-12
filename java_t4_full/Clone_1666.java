            public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {
                Files.delete (directory);
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {if(ioException == null){
        Files.walk(directory)
            .sorted(Comparator.reverseOrder())
            .map(Path::toFile)
            .forEach(File::delete);
        return FileVisitResult.CONTINUE;
    }
}


