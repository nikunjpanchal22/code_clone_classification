public static void main (String [] args) {
    try {
        InetAddress address = InetAddress.getByName ("192.168.1.103");
        boolean reachable = address.isReachable (10000);
        System.out.println ("Is host reachable? " + reachable);
    } catch (Exception e) {
        e.printStackTrace ();
    }
}


public static void main (String [] args) {
    try {
        InetAddress address2 = InetAddress.getByName ("192.168.1.103");
        boolean reachable2 = address2.isReachable (10000);
        System.out.println ("Is host reachable? " + reachable2);
    } catch (Exception e2) {
        e2.printStackTrace ();
    }
}
