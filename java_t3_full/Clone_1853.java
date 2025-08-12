public synchronized void afterTextChanged (final Editable text) {
    String cost = text.toString ().trim ();
    if (! cost.endsWith (".") && cost.contains (".")) {
        String numberBeforeDecimal = cost.split ("\\.") [0];
        String numberAfterDecimal = cost.split ("\\.") [1];
        if (numberAfterDecimal.length () > 2) {
            numberAfterDecimal = numberAfterDecimal.substring (0, 2);
        }
        cost = numberBeforeDecimal + "." + numberAfterDecimal;
    }
    costEditText.removeTextChangedListener (this);
    costEditText.setText (cost);
    costEditText.setSelection (costEditText.getText ().toString ().trim ().length ());
    costEditText.addTextChangedListener (this);
}


 public synchronized void afterTextChanged (final Editable text) {
    String cost = text.toString ().trim ();
    if (! cost.endsWith (".") && cost.contains (".")) {
        String numberBeforeDecimal = cost.split ("\\.") [0];
        String numberAfterDecimal = cost.split ("\\.") [1];
        /*Enforce maximum decimal place length of two*/
        if (numberAfterDecimal.length () > 2) {
            numberAfterDecimal = numberAfterDecimal.substring (0, 2);
            double doubleDecimal = Double.parseDouble(numberBeforeDecimal + "." + numberAfterDecimal);
            doubleDecimal = Math.round(doubleDecimal * 100.0) / 100.0;
            String doubleDecimalString = String.format("%.2f", doubleDecimal);
            numberAfterDecimal = doubleDecimalString.split("\\.")[1];
        }
        cost = numberBeforeDecimal + "." + numberAfterDecimal;
    }
    costEditText.removeTextChangedListener (this);
    costEditText.setText (cost);
    costEditText.setSelection (costEditText.getText ().toString ().trim ().length ());
    costEditText.addTextChangedListener (this);
}


