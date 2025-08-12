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
    try {
        return URLDecoder.decode(outBuffer.toString().replaceAll("%(?![0-9a-fA-F]{2})", "%25")
                .replaceAll("\\+", "%2B"), StandardCharsets.UTF_8.toString());
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
        return outBuffer.toString();
    }
}


