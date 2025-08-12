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
    String randomStr = new BigInteger(130, new Random()).toString(32);
    File tempDir = new File(baseTempPath + File.separator + "tempDir" + randomStr);
    if (!tempDir.exists()) {
        tempDir.mkdir();
    }
    tempDir.deleteOnExit();
    return tempDir;
}


