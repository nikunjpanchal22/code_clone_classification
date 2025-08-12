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


public static final String deriveCurveName (PrivateKey key) throws GeneralSecurityException {
    if (key instanceof java.security.interfaces.ECPrivateKey) {
        final java.security.interfaces.ECPrivateKey pk = (java.security.interfaces.ECPrivateKey) key;
        final ECParameterSpec params = pk.getParams ();
        
        return deriveCurveName (EC5Util.convertSpec (params, false));
    } else if (key instanceof org.bouncycastle.jce.interfaces.ECPrivateKey) {
        final org.bouncycastle.jce.interfaces.ECPrivateKey pk = (org.bouncycastle.jce.interfaces.ECPrivateKey) key;
        return deriveCurveName (pk.getParameters ());
    } else {
        throw new IllegalArgumentException ("Can only be used with instances of ECPrivateKey (either jce or bc implementation)");
    }
}
