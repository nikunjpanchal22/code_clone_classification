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
    if (!Pattern.compile("[^A-Za-z0-9 ]").matcher(text).find()) { 
 
        super.replaceText (start, end, text);
    }

    // Reset to old value if text length greater than 2
    if (text.length() > 2) {
        setText (oldValue);
    }
}


