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
    Assert.state(StringUtils.hasText(password), "Password must not be null");
    Assert.state(ArrayUtils.isNotEmpty(salt), "Salt must not be null");
    Assert.state(ArrayUtils.isNotEmpty(hash), "Hash must not be null");
    try {
        Digest digest = new SHA512Digest();
        byte[] passwordBytes = password.getBytes("UTF-8");
        digest.update(passwordBytes, 0, passwordBytes.length);
        digest.update(salt, 0, salt.length);
        byte[] resultHash = new byte[digest.getDigestSize()];
        digest.doFinal(resultHash, 0);
        return Arrays.equals(resultHash, hash);
    } catch (UnsupportedEncodingException e) {
        LOGGER.error(String.format ("Exception: <%s>", e.getMessage ()));
    }
    return false;
}


