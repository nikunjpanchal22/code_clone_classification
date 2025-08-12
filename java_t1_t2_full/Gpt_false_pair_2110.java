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
        result = URI.create(URLDecoder.decode(file.toURI().toString(), "UTF-8")).getScheme();
    } catch (Exception e) {
        result = "unknown";
    }
    return result;
}
