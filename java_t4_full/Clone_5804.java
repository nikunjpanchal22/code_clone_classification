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
    try {
        return String.valueOf(file.toURI().toURL().getProtocol());
    } catch (Exception e) {
        return "unknown";
    }
}


