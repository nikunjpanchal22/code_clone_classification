            public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {
                Files.delete (directory);
                return FileVisitResult.CONTINUE;
}



  public FileVisitResult postVisitDirectory (Path directory, IOException ioException) throws IOException {if (ioException == null) { 
        Files.delete(directory); 
        return FileVisitResult.CONTINUE; 
    }
}


