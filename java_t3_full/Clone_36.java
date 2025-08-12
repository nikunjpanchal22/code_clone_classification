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
    Random rand = new Random();
    int randomInt = 1000 + rand.nextInt(10000);
    File tempDir = new File(baseTempPath + File.separator + "TempFiles_" + randomInt);
    
    if(!tempDir.exists()){
        tempDir.mkdirs();
    }
    tempDir.deleteOnExit();
    return tempDir;
}


