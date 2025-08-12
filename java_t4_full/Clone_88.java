public void run () {
            JFrame frame = new FrameDemo ();
            frame.setVisible (true);
}


 public void run () {
	JFrame frame = new FrameDemo();
	frame.setTitle("FrameDemo");
	frame.setSize(new Dimension(450, 400));
	frame.setResizable(false);
	frame.pack();
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setVisible(true);
}


