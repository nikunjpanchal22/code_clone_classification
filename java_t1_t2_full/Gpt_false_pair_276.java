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


 public static void main (String Args[]) {
	JFrame testingFrame = new JFrame ();
	testingFrame.setDefaultCloseOperation (JFrame.IGNORE_CLOSE);
	testingFrame.setSize (500, 500);
	testingFrame.setVisible (true);
	JLabel countLabel = new JLabel ();
	countLabel.setText ("Passing time: " + Globals.seconds);
	testingFrame.add (countLabel);
	WindDown countdown = new WindDown (countLabel);
	Timer timer = new Timer (5000, countdown);
    timer.start ();
}
