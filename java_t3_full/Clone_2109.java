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



	public static final String deriveCurveName (PublicKey publicKey) throws GeneralSecurityException {if (publicKey instanceof java.security.interfaces.ECPublicKey) { 
    	final java.security.interfaces.ECPublicKey pk = (java.security.interfaces.ECPublicKey) publickey; 
        final ECParameterSpec params = pk.getParams(); 
        return deriveCurveName(params); 
    } 
    else if (publicKey instanceof org.bouncycastle.jce.interfaces.ECPublicKey) { 
        final org.bouncycastle.jce.interfaces.ECPublicKey pk = (org.bouncycastle.jce.interfaces.ECPublicKey) publickey; 
        return getCurveName(pk); 
    } 
}


