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
    String cost = text.toString().trim();
    int numDecimalSpaces = 0;
    if(cost.contains(".")) {
        numDecimalSpaces = cost.split("\\.")[1].length();
    }
    if (!cost.endsWith(".") && numDecimalSpaces > 2) {
        String[] costArray = cost.split("\\.");
        double numberBeforeDecimal = Double.parseDouble(costArray[0]);
        double numberAfterDecimal = Double.parseDouble("0."+costArray[1]);
        if(numberAfterDecimal > 0.99) {
            numberAfterDecimal = 0.99;
        }
        String formattedDecimal = String.format("%.2f", numberAfterDecimal);
        cost = numberBeforeDecimal + "." + formattedDecimal.split("\\.")[1];
    }
    costEditText.removeTextChangedListener(this);
    costEditText.setText(cost);
    costEditText.setSelection(costEditText.getText().toString().trim().length());
    costEditText.addTextChangedListener(this);
}


