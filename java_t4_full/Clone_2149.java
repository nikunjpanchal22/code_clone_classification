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
                TimerTask tt = new TimerTask(){

                    @Override
                    public void run(){
                        highlightNextWord();
                    }
                };
                Timer t = new Timer();
                t.schedule(tt, charsTiming);
            } else {
                reset ();
                t.cancel ();
            }
            count++;
}


