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
    JFrame testing2 = new JFrame ();
    testing2.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    testing2.setSize (1000, 1000);
    testing2.setVisible (true);
    JLabel countDownLabel2 = new JLabel ();
    countDownLabel2.setText ("Now it's : " + Globals.seconds);
    testing2.add (countDownLabel2);
    CountDown countdown2 = new CountDown (countDownLabel2);
    Timer timer2 = new Timer (3000, countDown2);
    timer2.start ();
}
