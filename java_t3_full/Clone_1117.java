        public void run () {
            WhiteSpace ws = new WhiteSpace ();
            Container gui = ws.getGui ();
            JFrame f = new JFrame ("White (OK Red) Space");
            f.add (gui);
            f.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
            f.setLocationByPlatform (true);
            f.setResizable (false);
            f.pack ();
            f.setVisible (true);
}


 public void run(){
		WhiteSpace ws = new WhiteSpace();
		Container gui = ws.getGui();
		JDialog dlg = new JDialog(new JFrame("White (OK Red) Space"), true);
		dlg.add(gui);
		dlg.pack();
		dlg.setResizable(false);
		dlg.setVisible(true);
		dlg.setLocation(150,150);
}


