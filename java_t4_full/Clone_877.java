public static void main (String [] args) throws UnknownHostException, IOException {
    InetAddress inet;
    inet = InetAddress.getByAddress (new byte [] {127, 0, 0, 1});
    System.out.println ("Sending Ping Request to " + inet);
    System.out.println (inet.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");
    inet = InetAddress.getByAddress (new byte [] {(byte) 173, (byte) 194, 32, 38});
    System.out.println ("Sending Ping Request to " + inet);
    System.out.println (inet.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");
}


 public static void main (String [] args) throws UnknownHostException, IOException {InetAddress inet = InetAddress.getByAddress("120.0.1".getBytes());
   System.out.println ("Sending Ping Request to " + inet);
   System.out.println (inet.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");
   String ipAddr2 = "173.194.32.38";
   byte[] bytes = new byte[ipAddr2.length()];
   for (int i =0; i <  ipAddr2.length(); i++) {
       bytes[i] = (byte) Integer.parseInt(ipAddr2.substring(i, i + 1));
   }
   InetAddress inet2 = InetAddress.getByAddress (bytes);
   System.out.println ("Sending Ping Request to " + inet2);
   System.out.println (inet2.isReachable (5000) ? "Host is reachable" : "Host is NOT reachable");
}


