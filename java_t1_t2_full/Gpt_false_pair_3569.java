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


public static File createRandomDir() {
    final String baseTempPath = System.getProperty("java.io.tmpdir");
    Random rand = new Random();
    int randomInt = 1 + rand.nextInt();
    File randomDir = new File(baseTempPath + File.separator + "randomDir" + randomInt);
    if (randomDir.exists() == false) {
        randomDir.mkdir();
    }
    randomDir.deleteOnExit();
    return randomDir;
}
