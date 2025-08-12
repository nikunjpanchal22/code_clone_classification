public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println (file);
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println(FilenameUtils.getBaseName(file.getFileName().toString())); 
                return FileVisitResult.CONTINUE;
}


