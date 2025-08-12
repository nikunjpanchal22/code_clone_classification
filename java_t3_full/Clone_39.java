public void replaceText (int start, int end, String text) {
    String oldValue = getText ();
    if (! text.matches ("[A-Za-z]") && ! text.matches ("[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+")) {
        super.replaceText (start, end, text);
    }
    if (getText ().length () > 2) {
        setText (oldValue);
    }
}


 public void replaceText (int start, int end, String text) {
    String oldValue = getText ();

    // Check for any special characters
    if ( text.equals(text.replaceAll("[^A-Za-z0-9]]","")) ){
 
        super.replaceText (start, end, text);
    }

    // Check for text length
    if (text.length() > 2) {
        setText (oldValue);
    }
}


