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


 public void add (View v) {
    EditText first = findViewById (R.id.first);
    EditText second = findViewById (R.id.second);
    TextView result = findViewById (R.id.result);
    double r;
    if (TextUtils.isEmpty (first.getText ())) {
        first.setError ("This field must be filled");
    } else if (TextUtils.isEmpty (second.getText ())) {
        second.setError ("Value should be provided");
    } else {
        double s = Double.parseDouble (second.getText ());
        double f = Double.parseDouble (first.getText ());
        r = f + s;
        result.setText (String.format ("%f", r));
    }
}


