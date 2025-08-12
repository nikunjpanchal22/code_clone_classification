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
          result = file.toURI ().toURL ().openConnection().getURL().getProtocol ();
     } catch (Exception e) {
          result = "unknown";
     }
     return result;
}
