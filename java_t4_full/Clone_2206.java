public static final String deriveCurveName (PrivateKey privateKey) throws GeneralSecurityException {
    if (privateKey instanceof java.security.interfaces.ECPrivateKey) {
        final java.security.interfaces.ECPrivateKey pk = (java.security.interfaces.ECPrivateKey) privateKey;
        final ECParameterSpec params = pk.getParams ();
        return deriveCurveName (EC5Util.convertSpec (params, false));
    } else if (privateKey instanceof org.bouncycastle.jce.interfaces.ECPrivateKey) {
        final org.bouncycastle.jce.interfaces.ECPrivateKey pk = (org.bouncycastle.jce.interfaces.ECPrivateKey) privateKey;
        return deriveCurveName (pk.getParameters ());
    } else throw new IllegalArgumentException ("Can only be used with instances of ECPrivateKey (either jce or bc implementation)");
}


 public static final String deriveCurveName (PrivateKey privateKey) throws GeneralSecurityException { if (privateKey instanceof java.security.interfaces.ECPrivateKey) {
        final java.security.interfaces.ECPrivateKey pk = (java.security.interfaces.ECPrivateKey) privateKey;
        final ECParameterSpec params = pk.getParams ();
        String result = deriveCurveName (EC5Util.convertSpec (params, false));
        return result;
     }
}


