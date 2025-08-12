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
            if (count < charsTiming.size ()) {
                highlightNextWord ();
                Timer t = (Timer)ae.getSource ();
                t.setDelay(charsTiming.get(count));
                t.restart();
            } else {
                reset ();
                t.stop ();
            }
            count ++;
}


