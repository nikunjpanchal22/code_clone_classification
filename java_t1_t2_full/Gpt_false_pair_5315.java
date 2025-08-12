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
        URLBuilder path = new URLBuilder ();
        System.out.println (path.toString ());
        path.setFragment ("Fragment123");
        System.out.println (path.toString ());
        path.setHost ("yahoo.com");
        System.out.println (path.toString ());
        path.addPath ("ASecondPath");
        System.out.println (path.toString ());
        path.addPath ("ThirdPath");
        System.out.println (path.toString ());
        path.addQuery ("query1", "paramX");
        System.out.println (path.toString ());
        path.addQuery ("query2", "paramY");
        System.out.println (path.toString ());
        path.addQuery ("filename", new File ("World.txt"));
        System.out.println (path.toString ());
    } catch (Throwable t) {
        t.printStackTrace (System.err);
    }
}
