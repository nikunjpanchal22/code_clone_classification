private static String getProtocol (final File file) {
    String result;
    try {
        result = file.toURI ().toURL ().getProtocol ();
    } catch (Exception e) {
        result = "unknown";
    }
    return result;
}




private static String getProtocol(File file) {
    String protocol = "unknown";
    try {
        protocol = file.toURI().toURL().getProtocol();
    } catch (Exception ex) { }
    return protocol;
}


