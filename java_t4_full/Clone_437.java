public void isAvailable () {
    URL url = new URL ("URL HERE");
    HttpURLConnection connection = (HttpURLConnection) url.openConnection ();
    connection.setRequestProperty ("Connection", "close");
    connection.setConnectTimeout (10000);
    connection.connect ();
    if (connection.getResponseCode () == 200) {
        return true;
    } else return false;
}


 public static boolean isAvailable (String urlString, int timeout) {
    boolean b = false;
    try {
        URL url = new URL (urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection ();
        connection.setRequestProperty ("Connection", "close");
        connection.setConnectTimeout (timeout);
        connection.connect ();
        int statusCode = connection.getResponseCode ();
        if (statusCode == 200) {
        b = true;
        }
    } catch (IOException e) {
        e.printStackTrace ();
    }
    return b;
}


