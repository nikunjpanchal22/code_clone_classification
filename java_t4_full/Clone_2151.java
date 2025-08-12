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
                ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
                ses.schedule(new Runnable(){
                    @Override
                    public void run(){
                        highlightNextWord();
                    }
                }, charsTiming);
            } else {
                reset ();
                ses.shutdown ();
            }
            count ++;
}


