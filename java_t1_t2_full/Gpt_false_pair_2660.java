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
            if (count < charsTiming.size ()) {
                highlightNextWord ();
                ((Timer) ae.getSource ()).setInitialDelay (charsTiming.get (count));
                ((Timer) ae.getSource ()).schedule();
            } else {
                reset ();
                ((Timer) ae.getSource ()).stop ();
            }
            count++;
}
