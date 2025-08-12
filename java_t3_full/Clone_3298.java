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





public void actionPerformed(ActionEvent e) {
    Timer timer = (Timer) e.getSource();
    if(count < charsTiming.size()) {
        timer.setInitialDelay(charsTiming.get(count));
        highlightNextWord();
        timer.restart();
    }
    else {
        timer.stop();
        reset();
    }
    count++;
}


