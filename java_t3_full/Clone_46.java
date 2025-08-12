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

    // Reject special characters
    if ( !Pattern.compile("[A-Za-z]").matcher(text).matches() && !Pattern.compile("[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+").matcher(text).matches() ) {
 
        super.replaceText (start, end, text);
    }

    // Reject text longer than 2 characters
    if (text.length() > 2) {
        setText (oldValue);
    }
}


