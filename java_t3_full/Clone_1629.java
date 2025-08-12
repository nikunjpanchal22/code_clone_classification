            public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {
                File dstFile = new File (strAbsPathDest + file.toAbsolutePath ().toString ().substring (strAbsPathSrc.length ()));
                if (dstFile.exists ()) return FileVisitResult.CONTINUE;
                if (! dstFile.getParentFile ().exists ()) dstFile.getParentFile ().mkdirs ();
                Files.copy (file, dstFile.toPath ());
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
    File dstFile = new File(strAbsPathDest + file.normalize().toString().substring(strAbsPathSrc.length()));
    if(dstFile.exists()) return FileVisitResult.CONTINUE;
    if (!dstFile.getParentFile().exists()) dstFile.getParentFile().mkdirs();
    Files.copy(file, dstFile.toPath());
    FileTime time = Files.getLastModifiedTime(file);
    Files.setLastModifiedTime(dstFile.toPath(), time);
    return FileVisitResult.CONTINUE;
}


