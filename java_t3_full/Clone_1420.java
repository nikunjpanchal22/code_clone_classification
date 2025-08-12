        public void actionPerformed (ActionEvent e) {
            if (w.hasNext ()) {
                _textField.setText (w.next ().getName ());
            } else {
                timer.stop ();
            }
}


 public void actionPerformed (ActionEvent e) { if (w.hasNext()) {
        String name = w.next().getName();
        _textField.setText("Next name is: " + name);
    } else {
        timer.stop();
        _textField.setText("End Reached");
    }
}


