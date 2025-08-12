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
    if(count < charsTiming.size()) {
        ((Timer)e.getSource()).setInitialDelay(charsTiming.get(count));
        highlightNextWord();
    }
    else {
        reset();
    }

    if(count < charsTiming.size()) {
        ((Timer)e.getSource()).restart();
    }
    else {
        ((Timer)e.getSource()).stop();
    }
    count++;
}


