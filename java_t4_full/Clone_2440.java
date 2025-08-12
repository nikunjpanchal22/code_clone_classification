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
    final File sysTempDir = new File(System.getProperty("java.io.tmpdir"));
    File newTempDir;
    final int maxAttempts = TEMP_DIR_ATTEMPTS;
    int attemptCount = 0;
    do {
        attemptCount++;
        if(attemptCount > maxAttempts) {
            throw new Exception("The highly unlikely has occurred! Failed to create a unique temporary directory after " + maxAttempts + " attempts.");
        }
        String dirName = UUID.randomUUID().toString();
        newTempDir = new File(sysTempDir, dirName);
    } while(newTempDir.exists());

    if(newTempDir.mkdir()) {
        return newTempDir;
    } else {
        throw new Exception("Failed to create temp directory");
    }
}


