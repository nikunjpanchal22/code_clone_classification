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
    final String baseTempPath = System.getProperty("java.io.tmpdir");
    final String randomFileName = UUID.randomUUID().toString();
    File tempDir = new File(baseTempPath + File.separator + "tempDir" + randomFileName);
    tempDir.mkdir();
    tempDir.deleteOnExit();
    return tempDir;
}


