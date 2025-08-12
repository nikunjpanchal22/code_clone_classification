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
    String baseDir = System.getProperty("java.io.tmpdir");
    AtomicInteger counter = new AtomicInteger();
    File tempDir = new File(baseDir + File.separator + "tempDir" + counter.getAndIncrement());
    tempDir.mkdirs();
    tempDir.deleteOnExit();
    return tempDir;
}


