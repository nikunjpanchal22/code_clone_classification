private static String getProtocol (final File file) {
    String result;
    try {
        result = file.toURI ().toURL ().getProtocol ();
    } catch (Exception e) {
        result = "unknown";
    }
    return result;
}




private static String getProtocol(final File file) {
    String protocolType = "unknown";
    try {
        protocolType = file.toURI().toURL().getProtocol();
    } catch (Exception e) { }
    return protocolType;
}

