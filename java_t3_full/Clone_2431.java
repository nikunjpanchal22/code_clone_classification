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





public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(700, 700);
    JLabel label = new JLabel("Time Remaining : " + Globals.seconds);
    frame.add(label);
    CountDown countDown = new CountDown(label);
    Timer timer = new Timer(4000, countDown);
    timer.start ();
    frame.setVisible(true);
}


