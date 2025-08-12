            public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {
                File dstFile = new File (strAbsPathDest + file.toAbsolutePath ().toString ().substring (strAbsPathSrc.length ()));
                if (dstFile.exists ()) return FileVisitResult.CONTINUE;
                if (! dstFile.getParentFile ().exists ()) dstFile.getParentFile ().mkdirs ();
                Files.copy (file, dstFile.toPath ());
                return FileVisitResult.CONTINUE;
}


 public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
    File dstFile = new File(strAbsPathDest + file.getRoot().relativize(strAbsPathSrc));
    if(dstFile.exists()) return FileVisitResult.CONTINUE;
    if (!dstFile.getParentFile().exists()) dstFile.getParentFile().mkdirs();
    CopyOption[] options = new CopyOption[]{
        StandardCopyOption.COPY_ATTRIBUTES,
        StandardCopyOption.REPLACE_EXISTING
    };
    Files.copy(file, dstFile.toPath(), options);
    return FileVisitResult.CONTINUE;
}


