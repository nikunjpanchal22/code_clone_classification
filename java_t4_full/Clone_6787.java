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
    String data = outBuffer.toString();
    data = java.util.Arrays.stream(data.split(""))
            .map(e -> e.replaceAll("\\+", "%2B"))
            .map(e -> e.replaceAll("%(?![0-9a-fA-F]{2})", "%25"))
            .reduce("", (x, y) -> x + y);
    return java.net.URLDecoder.decode(data, StandardCharsets.UTF_8);
}


