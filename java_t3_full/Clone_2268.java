public static File createTempDir () {
    final String baseTempPath = System.getProperty ("java.io.tmpdir");
    Random rand = new Random ();
    int randomInt = 1 + rand.nextInt ();
    File tempDir = new File (baseTempPath + File.separator + "tempDir" + randomInt);
    if (tempDir.exists () == false) {
        tempDir.mkdir ();
    }
    tempDir.deleteOnExit ();
    return tempDir;
}





public static File createTempDir() {
    String baseTempPath = System.getProperty("java.io.tmpdir");
    String threadName = Thread.currentThread().getName();
    File tempDir = new File(baseTempPath + File.separator + "tempDir" + threadName);
    if (!tempDir.exists()) {
        tempDir.mkdir();
    }
    tempDir.deleteOnExit();
    return tempDir;
}


