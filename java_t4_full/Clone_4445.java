public String generateRandomPassword (final int length) {
    if (length < 1) {
        throw new IllegalArgumentException ("length must be greater than 0");
    }
    final char [] buf = new char [length];
    for (int idx = 0;
    idx < buf.length; ++ idx) {
        buf [idx] = symbols [RANDOM.nextInt (symbols.length)];
    }
    return shuffle (new String (buf));
}




public String randomPassword(int len) {
    if (len < 1)
        throw new IllegalArgumentException();
    char[] passwd = new char[len];
    IntStream.range(0, len).forEach(i -> passwd[i] = symbols[RANDOM.nextInt(symbols.length)]);
    return shuffle(new String(passwd));
}


