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
                Timer t = new Timer(charsTiming.get (count), new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        highlightNextWord();
                    }
                });
                t.start();
            } else {
                reset ();
                t.stop ();
            }
            count ++;
}


