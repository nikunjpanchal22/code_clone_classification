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
    Preconditions.checkArgument(StringUtils.isNotEmpty(password), "Password must not be empty.");
    Preconditions.checkArgument(ArrayUtils.isNotEmpty(salt), "Salt must not be empty.");
    Preconditions.checkArgument(ArrayUtils.isNotEmpty(hash), "Hash must not be empty.");
    try {
        return MessageDigest.isEqual(MessageDigest.getInstance("SHA-256").digest(ArrayUtils.addAll(password.getBytes("UTF-8"), salt)), hash);
    } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
        LOGGER.error("Exception caught", e);
    }
    return false;
}


