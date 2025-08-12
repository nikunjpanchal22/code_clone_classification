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
    String baseName = System.nanoTime() + "-";
    for(int counter = 0; counter < TEMP_DIR_ATTEMPTS; counter++) {
        File tempDir = new File(baseDir, baseName + new Random().nextInt(1000));
        if(tempDir.mkdir()) {
            return tempDir;
        }
    }
    throw new IllegalStateException("Failed to create directory");
}


