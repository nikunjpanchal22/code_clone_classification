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
	JFrame systemTesting = new JFrame ();
	systemTesting.setDefaultCloseOperation (JFrame.CLOSE_ON_EXIT);
	systemTesting.setSize (1500, 1500);
	systemTesting.setVisible (true);
	JLabel countLabel = new JLabel ();
	countLabel.setText ("Counting Down: " + Globals.seconds);
	systemTesting.add (countLabel);
	TimeIsTicking countdown = new TimeIsTicking (countLabel);
	Timer timer = new Timer (5000, countDown);
    timer.start ();
}
