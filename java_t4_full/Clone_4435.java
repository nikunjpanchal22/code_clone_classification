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
    Assert.notNull(password, "Password should not be null");
    Assert.notNull(salt, "Salt should not be null");
    Assert.notNull(hash, "Hash should not be null");
    try {
        MessageDigest digest = MessageDigest.getInstance("SHA-512");
        digest.reset();
        digest.update(salt);
        return MessageDigest.isEqual(digest.digest(password.getBytes("UTF-8")), hash);
    } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
        LOGGER.error("Exception caught", e);
    }
    return false;
}


