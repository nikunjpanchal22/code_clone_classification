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
    String tempDir = System.getProperty("java.io.tmpdir");
    long nanoTime = System.nanoTime();
    File directory = new File(tempDir + File.separator + "tempDir" + Long.toString(nanoTime));
    if (!directory.exists()) {
        directory.mkdir();
    }
    directory.deleteOnExit();
    return directory;
}


