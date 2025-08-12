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


 public boolean isAvailable (String urlString, int timeout) throws IOException {
    URL url = new URL (urlString);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection ();
    connection.setRequestProperty ("Connection", "close");
    connection.setConnectTimeout (timeout);
    connection.connect ();
    int statusCode = connection.getResponseCode ();
    if (statusCode == 200) {
        return true;
    } else return false;
}


