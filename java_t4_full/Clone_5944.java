public static void main (String [] args) throws Exception {
    final int fakeConstructorArg = 10;
    Object a = new Object () {
        {
            System.out.println ("arg = " + fakeConstructorArg);
        }
    }
    ;
}



 

public static void main (String [] args) throws Exception {
    final int fakeConstructorArg = 10;
    Object a = new Object () {
        {
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();
            byte buf[] = ("arg = " + fakeConstructorArg).getBytes();
            DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234);
            ds.send(DpSend);
        }
    };
}


