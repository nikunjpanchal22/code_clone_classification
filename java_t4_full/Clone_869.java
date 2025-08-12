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


 public String generateRandomPassword ( final int length ) {
    if ( length < 1 ) {
        throw new IllegalArgumentException ( "length must be greater than 0" );
    }
    final StringBuilder sb = new StringBuilder ();
    for ( int i = 0; i < length; i++ ) {
        int j = ( int ) ( Math.random () * symbols.length );
        sb.append ( symbols[j] );
    }
    return sb.toString ();
}


