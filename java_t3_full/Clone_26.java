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
    File rootDir = Paths.get(System.getProperty("java.io.tmpdir")).toFile(); 
    String templateString = System.currentTimeMillis() + "-%d"; 
    for (int attempt = 0; attempt < TEMP_DIR_ATTEMPTS; attempt++) { 
        String baseName = String.format(templateString, attempt);
        File tempDir = new File(rootDir, baseName); 
        if (tempDir.mkdir()) { 
            return tempDir; 
        }
    }
    throw new IllegalStateException("Failed to create directory within " +  TEMP_DIR_ATTEMPTS + " attempts (tried " + templateString + "0 to " + templateString + (TEMP_DIR_ATTEMPTS - 1) + ')'); 
}


