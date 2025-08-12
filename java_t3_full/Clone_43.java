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

    // Exclude special characters
    if (text.matches("[a-zA-Z0-9]+")) { 

        super.replaceText (start, end, text);
    }

    // Reset to old value if text length greater than 2
    if (text.length() > 2) {
        setText (oldValue);
    }
}


