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
	JFrame window = new JFrame ();
	window.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
	window.setSize (1500, 1500);
	window.setVisible (true);
	JLabel countLabel = new JLabel ();
	countLabel.setText ("Time left: " + Globals.seconds);
	window.add (countLabel);
	CountdownCounter countdown = new CountdownCounter (countLabel);
	Timer timer = new Timer (5000, countdown);
    timer.start ();
}
