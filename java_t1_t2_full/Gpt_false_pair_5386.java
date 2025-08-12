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
    if (index < charDelay.size()) {
        highLightChangingWord ();
        ((Timer) ae.getSource ()).setInitialDelay (charDelay.get (index));
        ((Timer) ae.getSource ()).start ();
    } else {
        reset ();
        ((Timer) ae.getSource ()).stop ();
    }
    index ++;
}
