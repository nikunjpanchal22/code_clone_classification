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
    try {
        if (publicKey instanceof java.security.interfaces.ECPublicKey) {
            return deriveCurveName(EC5Util.convertSpec(((ECPublicKey) publicKey).getParams(), false));
        } else if (publicKey.getClass().isAssignableFrom(org.bouncycastle.jce.interfaces.ECPublicKey.class)) {
            return deriveCurveName(((org.bouncycastle.jce.interfaces.ECPublicKey) publicKey).getParameters());
        }
    } catch (Exception e) {
        throw new IllegalArgumentException("Unsupported key type.");
    }
    return null;
}


