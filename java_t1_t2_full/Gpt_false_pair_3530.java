public void add (View v) {
    EditText first = findViewById (R.id.first);
    EditText second = findViewById (R.id.second);
    TextView result = findViewById (R.id.result);
    double r;
    if (TextUtils.isEmpty (first.getText ().toString ())) {
        first.setError ("This field can't be empty");
    } else if (TextUtils.isEmpty (second.getText ().toString ())) {
        second.setError ("This field can't be empty");
    } else {
        double s = Double.parseDouble (second.getText ().toString ());
        double f = Double.parseDouble (first.getText ().toString ());
        r = f + s;
        result.setText ("" + r);
    }
}


public void addView (View v) {
    EditText firstInput = findViewById (R.id.first);
    EditText secondInput = findViewById (R.id.second);
    TextView output = findViewById (R.id.result);
    double outputValue;
    if (TextUtils.isEmpty (firstInput.getText ().toString ())) {
        firstInput.setError ("This field can't be empty");
    } else if (TextUtils.isEmpty (secondInput.getText ().toString ())) {
        secondInput.setError ("This field can't be empty");
    } else {
        double secondInputValue = Double.parseDouble (secondInput.getText ().toString ());
        double firstInputValue = Double.parseDouble (firstInput.getText ().toString ());
        outputValue = firstInputValue + secondInputValue;
        output.setText ("" + outputValue);
    }
}
