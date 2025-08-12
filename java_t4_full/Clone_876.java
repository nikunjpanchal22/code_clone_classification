public static void main (String [] args) throws UnknownHostException, IOException {
    InetAddress inet;
    inet = InetAddress.getByAddress (new byte [] {127, 0, 0, 1});
    System.out.println ("Sending Ping Request to " + inet);
    System.out.println (inet.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");
    inet = InetAddress.getByAddress (new byte [] {(byte) 173, (byte) 194, 32, 38});
    System.out.println ("Sending Ping Request to " + inet);
    System.out.println (inet.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");
}


public static void main (String [] args) throws IOException {
    byte[] IP1 = {127, 0, 0, 1};
    byte[] IP2 = {(byte) 173, (byte) 194, 32, 38};
    try {
       InetAddress inetAddress1 = InetAddress.getByAddress(IP1);
       InetAddress inetAddress2 = InetAddress.getByAddress(IP2);
       System.out.println ("Sending Ping Request to " + inetAddress1);
       if(inetAddress1.isReachable (5000)) {
            System.out.println("Host is reachable");
       }
       else {
            System.out.println("Host is NOT reachable");
       }
       System.out.println ("Sending Ping Request to " + inetAddress2);
       if(inetAddress2.isReachable (5000)) {
            System.out.println("Host is reachable");
       }
       else {
            System.out.println("Host is NOT reachable");
       }
    }
    catch(UnknownHostException e) {
       System.out.println("Error: UnknownHostException");
    }
    catch(IOException e) {
       System.out.println("Error connecting to host");
    }
}


