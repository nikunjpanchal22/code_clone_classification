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
    String re1 = "%(?![0-9a-fA-F]{2})";
    String re2 = "\\+";
    String data = outBuffer.toString().replaceAll(re1, "%25").replaceAll(re2, "%2B");
    try {
        data = URLDecoder.decode(data, "utf-8");
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    return data;
}


