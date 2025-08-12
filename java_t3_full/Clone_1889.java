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
            JPanel newPanel = new JPanel ();
            long start = System.currentTimeMillis ();
            frame.remove (panel);
            frame.validate ();
            newPanel.setBackground (Color.BLUE);
            frame.add (newPanel);
            long end = System.currentTimeMillis ();       
}


