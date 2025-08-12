public void actionPerformed (ActionEvent e) {
    if (w.hasNext ()) {
        _textField.setText (w.next ().getName ());
    } else {
        timer.stop ();
    }
}


public void actionPerformed (ActionEvent e) {
    if (e.next () != null) {
        _textField.setText (e.next ().getName ());
    } else {
        timer.stop ();
    }
}
