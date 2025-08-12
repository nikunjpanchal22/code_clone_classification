public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println (file);
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {
                Long size = Files.size(file); 
                System.out.println("Size of " + file + " is " + size);
                return FileVisitResult.CONTINUE;
}


