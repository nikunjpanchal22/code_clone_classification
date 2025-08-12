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

    // Remove all special characters
    text = text.replaceAll("[^A-Za-z0-9]", "");

    super.replaceText (start, end, text);

    // Reset value if text is too long
    if (text.length() > 2) {
        setText (oldValue);
    }
}


