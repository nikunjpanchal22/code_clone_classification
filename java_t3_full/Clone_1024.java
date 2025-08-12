public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println (file);
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {
                Map<String,Object> atrMap = Files.readAttributes(file, "*");
                System.out.println(atrMap);
                return FileVisitResult.CONTINUE;
}


