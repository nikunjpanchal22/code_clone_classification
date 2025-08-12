public static void main (String [] args) throws Exception {
    KeyPairGenerator hostKeyGen = KeyPairGenerator.getInstance ("DH");
    BigInteger p = new BigInteger (modp2048, 16);
    BigInteger g = BigInteger.valueOf (2L);
    System.out.println ("p bits: " + p.bitLength ());
    System.out.println ("g bits: " + g.bitLength ());
    DHParameterSpec dhGrp14KeySpec = new DHParameterSpec (p, p);
    hostKeyGen.initialize (dhGrp14KeySpec);
    System.out.println ("Creating Host DH private key...");
    KeyPair hostKey = hostKeyGen.generateKeyPair ();
    System.out.println ("Initiating host side Schannel...");
    KeyAgreement schannel = KeyAgreement.getInstance ("DH");
    schannel.init (hostKey.getPrivate ());
}




public static void main (String [] args) throws Exception {
    KeyPairGenerator kpGenInstance = KeyPairGenerator.getInstance ("DH");
    BigInteger pNum = new BigInteger (modp2048, 16);
    BigInteger gNum = BigInteger.valueOf (2L);
    DHParameterSpec dhParamSpec = new DHParameterSpec (pNum, pNum);
    kpGenInstance.initialize (dhParamSpec);
    KeyPair theKeyPair = kpGenInstance.generateKeyPair ();
    KeyAgreement instAgreement = KeyAgreement.getInstance ("DH");
    instAgreement.init (theKeyPair.getPrivate ());
}


