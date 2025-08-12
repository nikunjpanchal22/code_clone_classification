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
    KeyPairGenerator kpGen = KeyPairGenerator.getInstance ("DH");
    BigInteger pBigInteger = new BigInteger (modp2048, 16);
    BigInteger gBigInteger = BigInteger.valueOf (2L);
    DHParameterSpec dhKeySpec = new DHParameterSpec (pBigInteger, pBigInteger);
    kpGen.initialize (dhKeySpec);
    KeyPair keyPairVal = kpGen.generateKeyPair ();
    KeyAgreement agreement = KeyAgreement.getInstance ("DH");
    agreement.init (keyPairVal.getPrivate ());
}


