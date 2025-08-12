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





public void actionPerformed(ActionEvent ae) {
    Timer timer = (Timer) ae.getSource();
    if(count < charsTiming.size()) {
        highlightNextWord();
        timer.setInitialDelay(charsTiming.get(count));
        timer.restart();
    }
    else {
        timer.stop();
        reset();
    }
    count++;
}


