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

        Pattern pattern = Pattern.compile("^[A-Za-z0-9_&\\\\!$%;:'\"(),./?\\[\\]*-]+$");
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()) {
           super.replaceSelection (text); 
        }
        if (getText ().length () > 2) {
            setText (oldValue);
        }
}


