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
    Timer source = (Timer) ae.getSource();
    int initialDelay = charsTiming.get(count);
    if(count < charsTiming.size()) {
        highlightNextWord();
        source.setInitialDelay(initialDelay);
        source.restart();
    } else {
        reset();
        source.stop();
    }
    count ++;
}


