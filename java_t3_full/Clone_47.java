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

    // Valid letters and numbers only
    if (text.matches("[A-Za-z0-9]*")) {

        super.replaceText (start, end, text);
    }

    // Reset to old value if text length greater than 2
    if (text.length() > 2) {
        setText (oldValue);
    }
}


