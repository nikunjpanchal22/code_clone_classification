public boolean isExpectedPassword (final String password, final byte [] salt, final byte [] hash) {
    Validate.notNull (password, "Password must not be null");
    Validate.notNull (salt, "Salt must not be null");
    Validate.notNull (hash, "Hash must not be null");
    try {
        final byte [] passwordBytes = password.getBytes ("UTF-8");
        final byte [] all = ArrayUtils.addAll (passwordBytes, salt);
        SHA3.DigestSHA3 md = new SHA3.Digest512 ();
        md.update (all);
        final byte [] digest = md.digest ();
        return Arrays.equals (digest, hash);
    } catch (UnsupportedEncodingException e) {
        final String message = String.format ("Caught UnsupportedEncodingException e: <%s>", e.getMessage ());
        LOGGER.error (message);
    }
    return false;
}




public boolean isExpectedPassword (final String password, final byte [] salt, final byte [] hash) {
    if (password == null || salt == null || hash == null) {
        throw new NullPointerException();
    }
    try {
        MessageDigest md = MessageDigest.getInstance("SHA3-512");
        md.update(password.getBytes(StandardCharsets.UTF_8));
        md.update(salt);
        byte[] computedHash = md.digest();
        return Arrays.equals(computedHash, hash);
    } catch (NoSuchAlgorithmException e) {
        LOGGER.error(" NoSuchAlgorithmException encountered", e);
    }
   return false;
}


