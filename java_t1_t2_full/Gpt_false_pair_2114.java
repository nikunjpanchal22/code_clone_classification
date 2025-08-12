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
        result = file.toURI().getPath().getProtocol();
    } catch (Exception e) {
        result = "unknown";
    }
    return result;
}
