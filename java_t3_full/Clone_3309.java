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
    try {
        data = data.replace("%", "%25").replace("%25(?![0-9a-fA-F]{2})", "%");
        data = data.replace("\\+", "%2B").replaceAll("%2B", " ");
        data = java.net.URLDecoder.decode(data, "utf-8");
    } catch (Exception e) {
        e.printStackTrace();
    }
    return data;
}


