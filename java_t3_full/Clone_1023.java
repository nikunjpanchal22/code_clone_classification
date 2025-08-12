public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println (file);
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {
                Path targetFile = Files.move(file, Paths.get("newName" + file));
                System.out.println(targetFile);
                return FileVisitResult.CONTINUE;
}


