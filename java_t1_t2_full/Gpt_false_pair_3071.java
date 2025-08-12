public void actionPerformed (ActionEvent ae) {
    if (count < charsTiming.size ()) {
        highlightNextWord ();
        ((Timer) ae.getSource ()).setInitialDelay (charsTiming.get (count));
        ((Timer) ae.getSource ()).restart ();
    } else {
        reset ();
        ((Timer) ae.getSource ()).stop ();
    }
    count ++;
}


public void actionPerformed (ActionEvent ae) {
    if (index < charsTiming.length ()) {
        highlightNextCharacter ();
        ((Timer) ae.getSource ()).setInitialDelay (charsTiming[index]);
        ((Timer) ae.getSource ()).restart ();
    } else {
        reset ();
        ((Timer) ae.getSource ()).stop ();
    }
    index ++;
}
