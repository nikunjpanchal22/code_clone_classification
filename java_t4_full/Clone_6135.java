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
    javax.swing.text.NumberFormatter nf = new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.##"));
    String costString = text.toString().trim();
    if(!costString.endsWith(".") && costString.contains(".")) {
        costString = nf.valueToString(Double.parseDouble(costString));
    }
    costEditText.removeTextChangedListener(this);
    costEditText.setText(costString);
    costEditText.setSelection(costString.length());
    costEditText.addTextChangedListener(this);
}


