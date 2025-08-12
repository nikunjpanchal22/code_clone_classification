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
        result = file.toURI().toURL().openConnection().getInputStream().getHeaderField("Content-Type").getProtocol();
    } catch (Exception e) {
        result = "unknown";
    }
    return result;
}
