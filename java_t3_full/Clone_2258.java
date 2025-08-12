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
    File baseDir = new File(System.getProperty("user.home"));
    String baseName = UUID.randomUUID().toString();
    for(int i = 0; i < TEMP_DIR_ATTEMPTS; i++) {
        File tempDir = new File(baseDir, baseName + i);
        if(tempDir.mkdir()) {
            return tempDir;
        }
    }
    throw new RuntimeException("Failed to create directory");
}


