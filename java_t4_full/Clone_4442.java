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




public String createRandomPass(int size) {
    if (size < 1)
        throw new IllegalArgumentException("Size must be greater than 0");
    char[] buffer = new char[size];
    IntStream.range(0, size).forEach(i -> buffer[i] = symbols[RANDOM.nextInt(symbols.length)]);
    return shuffle(new String(buffer));
}


