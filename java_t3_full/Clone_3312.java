public static String replacer (StringBuffer outBuffer) {
    String data = outBuffer.toString ();
    try {
        data = data.replaceAll ("%(?![0-9a-fA-F]{2})", "%25");
        data = data.replaceAll ("\\+", "%2B");
        data = URLDecoder.decode (data, "utf-8");
    } catch (Exception e) {
        e.printStackTrace ();
    }
    return data;
}




public static String replacer(StringBuffer outBuffer) {
    return java.util.Optional.of(outBuffer.toString().replaceAll("%(?![0-9a-fA-F]{2})", "%25")
            .replaceAll("\\+", "%2B"))
            .map(e -> {
                try {
                    return URLDecoder.decode(e, "utf-8");
                } catch (UnsupportedEncodingException ex) {
                    ex.printStackTrace();
                    return e;
                }
            }).orElse("");
}


