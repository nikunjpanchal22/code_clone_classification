private static String getProtocol (final File file) {
    String result;
    try {
        result = file.toURI ().toURL ().getProtocol ();
    } catch (Exception e) {
        result = "unknown";
    }
    return result;
}


 private static String getProtocol (final File file) {
    String result;
    try {
        result =  getContentType(file.toURI().toURL()).split(":")[0].getProtocol();
    } catch (Exception e) {
        result = "unknown";
    }
    return result;
}
