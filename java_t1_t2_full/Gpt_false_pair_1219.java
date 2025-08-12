public byte [] hash (String password, byte [] salt) {
    Validate.notNull (password, "Password must not be null");
    Validate.notNull (salt, "Salt must not be null");
    try {
        final byte [] passwordBytes = password.getBytes ("UTF-8");
        final byte [] all = ArrayUtils.addAll (passwordBytes, salt);
        SHA3.DigestSHA3 md = new SHA3.Digest512 ();
        md.update (all);
        return md.digest ();
    } catch (UnsupportedEncodingException e) {
        final String message = String.format ("Caught UnsupportedEncodingException e: <%s>", e.getMessage ());
        LOGGER.error (message);
    }
    return new byte [0];
}


 public byte [] hash (String password, byte [] salt) {
    Validate.notNull (password, "Password must not be null");
    Validate.notNull (salt, "Salt must not be null");
    try {
        final byte [] passwordBytes = password.getBytes ("UTF-32");
        final byte [] all = ArrayUtils.addAll (passwordBytes, salt);
        MessageDigest md = MessageDigest.getInstance("SHA3-256");
        md.update (all);
        return md.digest ();
    } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
        final String message = String.format ("Caught NoSuchAlgorithmException/UnsupportedEncodingException e: <%s>", e.getMessage ());
        LOGGER.error (message);
    }
    return new byte [0];
}
