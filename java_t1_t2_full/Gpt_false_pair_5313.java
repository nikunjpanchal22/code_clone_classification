public static void main (String args []) {
    try {
        URLBuilder url = new URLBuilder ();
        System.out.println (url.toString ());
        url.setFragment ("fragment");
        System.out.println (url.toString ());
        url.setHost ("host.com");
        System.out.println (url.toString ());
        url.addPath ("APath");
        System.out.println (url.toString ());
        url.addPath ("AnotherPath");
        System.out.println (url.toString ());
        url.addQuery ("query1", "param1");
        System.out.println (url.toString ());
        url.addQuery ("query 2", "param 2");
        System.out.println (url.toString ());
        url.addQuery ("file", new File ("Hello World.txt"));
        System.out.println (url.toString ());
    } catch (Throwable t) {
        t.printStackTrace (System.err);
    }
}


public static void main (String args []) {
    try {
        URLBuilder url = new URLBuilder ();
        System.out.println (url.getUrl ());
        url.setFragment ("fragment");
        System.out.println (url.getUrl ());
        url.setHostName ("host.com");
        System.out.println (url.getUrl ());
        url.appendPath ("/APath");
        System.out.println (url.getUrl ());
        url.appendPath ("/AnotherPath");
        System.out.println (url.getUrl ());
        url.addQueryParam ("q1", "param1");
        System.out.println (url.getUrl ());
        url.addQueryParam ("q2", "param 2");
        System.out.println (url.getUrl ());
        url.attachFile (new File ("Hello World.txt"));
        System.out.println (url.getUrl ());
    } catch (Throwable t) {
        t.printStackTrace (System.err);
    }
}
