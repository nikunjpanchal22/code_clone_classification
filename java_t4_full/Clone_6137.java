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
        String price = text.toString().trim();
        if (! price.endsWith(".") && price.contains(".")) {
            price = formatTextAsCost(price);
        }
        saveTextInField(price);
    }
    private String formatTextAsCost(String text){
        String[] parts = text.split("\\.");
        String decimalPart = parts[1];
        if (decimalPart.length() > 2) {
            decimalPart = decimalPart.substring(0, 2);
        }
        return parts[0] + "." + decimalPart;
    }
    private void saveTextInField(String text){
        costEditText.removeTextChangedListener(this);
        costEditText.setText(text);
        costEditText.setSelection(text.length());
        costEditText.addTextChangedListener(this);
}


