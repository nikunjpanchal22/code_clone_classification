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


public void addFunction (View v) {
    EditText source1 = findViewById (R.id.first);
    EditText source2 = findViewById (R.id.second);
    TextView answer = findViewById (R.id.result);
    double finalValue;
    if (TextUtils.isEmpty (source1.getText ().toString ())) {
        source1.setError ("This field can't be empty");
    } else if (TextUtils.isEmpty (source2.getText ().toString ())) {
        source2.setError ("This field can't be empty");
    } else {
        double secondData = Double.parseDouble (source2.getText ().toString ());
        double firstData = Double.parseDouble (source1.getText ().toString ());
        finalValue = firstData + secondData;
        answer.setText ("" + finalValue);
    }
}
