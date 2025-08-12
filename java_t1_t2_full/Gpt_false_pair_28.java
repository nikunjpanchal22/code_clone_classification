public void replaceSelection (String text) {
    String oldValue = getText ();
    if (! text.matches ("[A-Za-z]") && ! text.matches ("[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+")) {
        super.replaceSelection (text);
    }
    if (getText ().length () > 2) {
        setText (oldValue);
    }
}


 public void replaceSelection (String text) {
        String oldValue = getText ();
        if (! text.matches ("[A-Za-z0-9\\-\\_\\.]+")) {
            super.replaceSelection (text);
        }
        if (getText ().length () > 2) {
            setText (oldValue);
        }
}
