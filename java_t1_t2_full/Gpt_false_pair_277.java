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
	JFrame frame = new JFrame ();
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	frame.setSize (600, 600);
	frame.setVisible (true);
	JLabel label = new JLabel ();
	label.setText ("Time remaining: " + Globals.seconds);
	frame.add (label);
	CountdownTimer countdown = new CountdownTimer (label);
	Timer timer = new Timer (5000, countdown);
    timer.start ();
}
