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
    String tempDirectoryPath = System.getProperty("java.io.tmpdir");
    String timeStamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
    File tempDirectory = new File(tempDirectoryPath + File.separator + "tempDir" + timeStamp);
    if (!tempDirectory.exists()) {
        tempDirectory.mkdir();
    }
    tempDirectory.deleteOnExit();
    return tempDirectory;
}


