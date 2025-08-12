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




public String generatePwd(int l) {
    if (l <= 0) 
        throw new IllegalArgumentException();
    char[] buf = new char[l];
    for(int i=0; i<l; i++){
        buf[i] = symbols[RANDOM.nextInt(symbols.length)];
    }
    return shuffle(new String(buf));
}


