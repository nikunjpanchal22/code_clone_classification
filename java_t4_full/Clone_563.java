public void copyFolder (File src, File dest) throws IOException {
    try (Stream < Path > stream = Files.walk (src.toPath ())) {
        stream.forEachOrdered (sourcePath -> {
            try {
                Files.copy (sourcePath, src.toPath ().resolve (dest.toPath ().relativize (sourcePath)));
            } catch (Exception e) {
                e.printStackTrace ();
            }
        });
    }
}


	public void copyFolder (File src, File dest) throws IOException{
    FileInputStream inStream = null;
    FileOutputStream outStream = null;
    try (Stream<Path> stream = Files.walk(src.toPath())) {
        stream.forEach (sourcePath -> {
            try {
                inStream = new FileInputStream(sourcePath.toFile ());
                outStream = new FileOutputStream (dest.toPath().resolve(src.toPath().relativize(sourcePath)).toFile ());
                byte []buffer = new byte[1024];
                int length;
                while ((length = inStream.read(buffer)) > 0){
                    outStream.write(buffer, 0, length);
                }
            }catch (Exception e){
                e.printStackTrace ();
            }finally{
                try{
                    if(inStream != null)
                        inStream.close();
                    if(outStream != null)
                        outStream.close();
                }catch(IOException ioe){
                    ioe.printStackTrace ();
                }
            }
        });
    }
}


