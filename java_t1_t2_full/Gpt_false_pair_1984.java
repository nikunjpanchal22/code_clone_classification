public static void main (String [] args) throws IOException {
    JFrame myFrame = new JFrame ("myJfTitle");
    myFrame.setLayout (new BorderLayout ());
    JButton myButton = new JButton ("Click me");
    myButton.setAlignmentX (Component.CENTER_ALIGNMENT);
    JProgressBar myBar = new JProgressBar ();
    LayoutManager overlay = new OverlayLayout (myBar);
    myBar.setLayout (overlay);
    myBar.setValue (50);
    myBar.add (myButton);
    myFrame.add (myBar, BorderLayout.CENTER);
    myFrame.pack ();
    myFrame.setSize (new Dimension (300, 100));
    myFrame.setVisible (true);
}


 public static void main (String [] args) throws IOException {JFrame myFrame = new JFrame ("myJfTitle");
    myFrame.setLayout (new GridLayout (1,1));
    JButton myButton = new JButton ("Click me");
    myButton.setAlignmentX (Component.LEFT_ALIGNMENT);
    JProgressBar myBar = new JProgressBar ();
    LayoutManager overlay = new OverlayLayout (myBar);
    myBar.setLayout (overlay);
    myBar.setValue (50);
    myBar.add (myButton);
    myFrame.add (myBar, BorderLayout.NORTH);
    myFrame.pack ();
    myFrame.setSize (new Dimension (300, 250));
    myFrame.setVisible (true);
}
