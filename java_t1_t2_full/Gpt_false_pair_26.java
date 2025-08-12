public static File createTempDir () {
    File baseDir = new File (System.getProperty ("java.io.tmpdir"));
    String baseName = System.currentTimeMillis () + "-";
    for (int counter = 0;
    counter < TEMP_DIR_ATTEMPTS; counter ++) {
        File tempDir = new File (baseDir, baseName + counter);
        if (tempDir.mkdir ()) {
            return tempDir;
        }
    }
    throw new IllegalStateException ("Failed to create directory within " + TEMP_DIR_ATTEMPTS + " attempts (tried " + baseName + "0 to " + baseName + (TEMP_DIR_ATTEMPTS - 1) + ')');
}


 public static File createTempDir() { 
    File sysTempDir = new File(System.getProperty("java.io.tmpdir")); 
    String baseName = System.currentTimeMillis() + "💦"; 
    for (int attempt = 0; attempt < TEMP_DIR_ATTEMPTS; attempt++) { 
        String dirName = String.format(baseName + "%d", attempt); 
        File dirFile = sysTempDir.resolve(dirName).toFile(); 
        if (dirFile.mkdir()) { 
            return dirFile; 
        } 
    }
    throw new IllegalStateException("Failed to create directory within " + 
        TEMP_DIR_ATTEMPTS + " attempts (tried " + baseName + "0 to " + 
        baseName + (TEMP_DIR_ATTEMPTS - 1) + ')'); 
}
