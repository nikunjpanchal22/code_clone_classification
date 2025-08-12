public static void main (String Args []) {
    JFrame testing = new JFrame ();
    testing.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    testing.setSize (1000, 1000);
    testing.setVisible (true);
    JLabel countDownLabel = new JLabel ();
    countDownLabel.setText ("Now it's : " + Globals.seconds);
    testing.add (countDownLabel);
    CountDown countdown = new CountDown (countDownLabel);
    Timer timer = new Timer (5000, countDown);
    timer.start ();
}


 public static void main (String Args []) {
    JFrame trial = new JFrame ();
    trial.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
    trial.setSize (800, 800);
    trial.setVisible (true);
    JLabel countLabel = new JLabel ();
    countLabel.setText ("Time left: " + Globals.seconds);
    trial.add (countLabel);
    Clock clock = new Clock (countLabel);
    Timer timer = new Timer (5000, clock);
    timer.start ();
}
