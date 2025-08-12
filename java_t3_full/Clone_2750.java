public static void main (String [] args) throws UnknownHostException, IOException {
    InetAddress inet;
    inet = InetAddress.getByAddress (new byte [] {127, 0, 0, 1});
    System.out.println ("Sending Ping Request to " + inet);
    System.out.println (inet.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");
    inet = InetAddress.getByAddress (new byte [] {(byte) 173, (byte) 194, 32, 38});
    System.out.println ("Sending Ping Request to " + inet);
    System.out.println (inet.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");
}


 

public static void main(String args[]) throws Exception {
    InetAddress inet;
    inet = InetAddress.getByAddress (new byte [] {127, 0, 0, 1});
    System.out.println ("Ping Request " + inet);
    System.out.println (inet.isReachable (5000) ? "Reachable" : "Not Reachable");
    inet = InetAddress.getByAddress(new byte[] {(byte) 204, (byte) 79, (byte) 197, (byte) 200});
    System.out.println ("Ping Request " + inet);
    System.out.println (inet.isReachable (5000) ? "Reachable" : "Not Reachable");
} 


