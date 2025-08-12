        public void actionPerformed (ActionEvent e) {
            long start = System.currentTimeMillis ();
            frame.remove (panel);
            long end = System.currentTimeMillis ();
            JPanel newPanel = new JPanel ();
            newPanel.setBackground (Color.BLUE);
            frame.add (newPanel);
            frame.validate ();
}


     public void actionPerformed (ActionEvent e) {
            long start = System.currentTimeMillis ();
            JPanel newPanel = new JPanel ();
            frame.remove (panel);
            frame.validate ();
            newPanel.setBackground (Color.BLUE);
            frame.add (newPanel);
            long end = System.currentTimeMillis ();
}


