        public void actionPerformed (ActionEvent e) {
            if (w.hasNext ()) {
                _textField.setText (w.next ().getName ());
            } else {
                timer.stop ();
            }
}


 public void actionPerformed (ActionEvent e) { if (w.hasNext()) {
        _textField.setText("Name found " + w.next().getName());
    } else {
        timer.stop();
        _textField.setText("No names found");
    }
}


