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
    String sysTempDir = System.getProperty("java.io.tmpdir"); 
    String dirNameTemplate = System.currentTimeMillis() + "-%d"; 
    for (int attempt = 0; attempt < TEMP_DIR_ATTEMPTS; attempt++) { 
        String name = String.format(dirNameTemplate, attempt); 
        File tempFileDir = new File(sysTempDir, name); 
        if (tempFileDir.mkdir()) { 
            return tempFileDir; 
        }
    }
    throw new IllegalStateException("Failed to create directory within " + 
        TEMP_DIR_ATTEMPTS + " attempts (tried " + dirNameTemplate + "0 to " + 
        dirNameTemplate + (TEMP_DIR_ATTEMPTS - 1) + ')'); 
}


