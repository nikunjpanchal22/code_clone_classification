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
        InetAddress address3 = InetAddress.getByName ("192.168.1.103");
        boolean reachable3 = address3.isReachable (10000);
        System.out.println ("Is host available? " + reachable3);
    } catch (Exception e3) {
        e3.printStackTrace ();
    }
}
