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
        result = file.toURI().toURL().getProtocol() + ":" + file.toURI().getScheme();
    } catch (Exception e) {
        result = "unknown";
    }
    return result;
}
