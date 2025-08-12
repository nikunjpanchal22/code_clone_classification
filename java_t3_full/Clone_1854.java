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


 public synchronized void afterTextChanged (final Editable text){
    String cost = text.toString().trim();
    if(!cost.endsWith(".") && cost.contains(".")){
        // split current number into two parts at the decimal point
        String[] costArray = cost.split("\\.");
        // get number before the decimal
        String numberBeforeDecimal = costArray[0];
        // get number after the decimal
        String numberAfterDecimal = costArray[1];
        // limit how long number after the decimal can be
        if(numberAfterDecimal.length() > 2){
            numberAfterDecimal = numberAfterDecimal.substring(0,2);
            // round number to two decimal point
            BigDecimal bd = new BigDecimal(Double.parseDouble(numberBeforeDecimal + "." + numberAfterDecimal));
            bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
            // combine the two parts with decimal point
            cost = bd.toString();
        }
    }
    // update the costEditText
    costEditText.removeTextChangedListener(this);
    costEditText.setText(cost);
    costEditText.setSelection(costEditText.getText().toString().trim().length());
    costEditText.addTextChangedListener(this);
}


