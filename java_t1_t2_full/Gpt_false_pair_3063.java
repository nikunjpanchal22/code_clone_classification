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
    JFrame testing3 = new JFrame ();
    testing3.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
    testing3.setSize (2000, 2000);
    testing3.setVisible (true);
    JLabel countDownLabel3 = new JLabel ();
    countDownLabel3.setText ("Now it's : " + Globals.minutes);
    testing3.add (countDownLabel3);
    CountDown countdown3 = new CountDown (countDownLabel3);
    Timer timer3 = new Timer (3000, countDown3);
    timer3.start ();
}
