public static final String deriveCurveName (PublicKey publicKey) throws GeneralSecurityException {
    if (publicKey instanceof java.security.interfaces.ECPublicKey) {
        final java.security.interfaces.ECPublicKey pk = (java.security.interfaces.ECPublicKey) publicKey;
        final ECParameterSpec params = pk.getParams ();
        return deriveCurveName (EC5Util.convertSpec (params, false));
    } else if (publicKey instanceof org.bouncycastle.jce.interfaces.ECPublicKey) {
        final org.bouncycastle.jce.interfaces.ECPublicKey pk = (org.bouncycastle.jce.interfaces.ECPublicKey) publicKey;
        return deriveCurveName (pk.getParameters ());
    } else throw new IllegalArgumentException ("Can only be used with instances of ECPublicKey (either jce or bc implementation)");
}





public static final String deriveCurveName(PublicKey publicKey) throws GeneralSecurityException {
    checkArgIsNotNull(publicKey, "Public key cannot be null");
    if (publicKey instanceof java.security.interfaces.ECPublicKey) {
        java.security.interfaces.ECPublicKey pk = (ECPublicKey) publicKey;
        return deriveCurveName(EC5Util.convertSpec(pk.getParams(), false));
    } else if (publicKey instanceof org.bouncycastle.jce.interfaces.ECPublicKey) {
        org.bouncycastle.jce.interfaces.ECPublicKey pk = (org.bouncycastle.jce.interfaces.ECPublicKey) publicKey;
        return deriveCurveName(pk.getParameters());
    }
    throw new IllegalArgumentException("Provided public key does not have a supported type. Please use ECPublicKey instances.");
}


