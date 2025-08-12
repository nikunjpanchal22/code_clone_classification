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
	JFrame testingArea = new JFrame ();
	testingArea.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	testingArea.setSize (2000, 2000);
	testingArea.setVisible (true);
	JLabel countLabel = new JLabel ();
	countLabel.setText ("Time is running : " + Globals.seconds);
	testingArea.add (countLabel);
	ClockTicking countdown = new ClockTicking (countLabel);
	Timer timer = new Timer (5000, countDown);
    timer.start ();
}
