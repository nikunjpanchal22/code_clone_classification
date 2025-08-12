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




public boolean isExpectedPassword (String password, byte [] salt, byte [] hash) {
    Objects.requireNonNull(password);
    Objects.requireNonNull(salt);
    Objects.requireNonNull(hash);
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes("UTF-8"));
        md.update(salt);
        final byte[] generatedHash = md.digest();
        return MessageDigest.isEqual(generatedHash, hash);
    } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
        LOGGER.error("Exception caught", e);
    }
    return false;
}


