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
        String[] costArray = cost.split("\\.");
        int numBeforeDecimal = Integer.parseInt(costArray[0]);
        int numAfterDecimal = Integer.parseInt(costArray[1]);
        if(numAfterDecimal > 99) {
            numAfterDecimal = 99;
        }
        double doubleDecimal = Double.parseDouble(numBeforeDecimal + "." + numAfterDecimal);
        doubleDecimal = Math.round(doubleDecimal * 100.0) / 100.0;
        String doubleDecimalString = String.format("%.2f", doubleDecimal);
        cost = doubleDecimalString;
    }
    costEditText.removeTextChangedListener(this);
    costEditText.setText(cost);
    costEditText.setSelection(costEditText.getText().toString().trim().length());
    costEditText.addTextChangedListener(this);
}


