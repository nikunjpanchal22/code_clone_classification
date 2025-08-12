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


          public void run () {
                Container gui = WhiteSpace.getGui();
                JFrame f = new JFrame("White (OK Red) Space");
                f.add(gui);
                f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                f.setLocationByPlatform (false);
                f.setSize(400,300);
                f.setResizable (true);
                f.pack();
                f.setVisible (true);
}
