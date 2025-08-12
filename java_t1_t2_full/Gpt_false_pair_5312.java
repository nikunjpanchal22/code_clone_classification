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
        System.out.println (url.toString ());
        url.setFragment ("fragment");
        System.out.println (url.toString ());
        url.setHost ("host.com");
        System.out.println (url.toString ());
        url.addPath ("/APath");
        System.out.println (url.toString ());
        url.addPath ("/AnotherPath");
        System.out.println (url.toString ());
        url.addQuery ("q1", "param1");
        System.out.println (url.toString ());
        url.addQuery ("q2", "param 2");
        System.out.println (url.toString ());
        url.addFile (new File ("Hello World.txt"));
        System.out.println (url.toString ());
    } catch (Throwable t) {
        t.printStackTrace (System.err);
    }
}
