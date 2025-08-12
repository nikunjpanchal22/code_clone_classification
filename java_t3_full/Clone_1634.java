            public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {
                File dstFile = new File (strAbsPathDest + file.toAbsolutePath ().toString ().substring (strAbsPathSrc.length ()));
                if (dstFile.exists ()) return FileVisitResult.CONTINUE;
                if (! dstFile.getParentFile ().exists ()) dstFile.getParentFile ().mkdirs ();
                Files.copy (file, dstFile.toPath ());
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
    File dstFile = new File(strAbsPathDest + file.toString().substring(strAbsPathSrc.length()));
    if(dstFile.exists()) return FileVisitResult.CONTINUE;
    if (!dstFile.getParentFile().exists()) dstFile.getParentFile().mkdirs();
    Files.move(file, dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    return FileVisitResult.CONTINUE;
}


