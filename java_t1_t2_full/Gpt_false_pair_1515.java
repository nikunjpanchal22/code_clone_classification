        public void mouseMoved (MouseEvent e) {
            int x = e.getX ();
            int y = e.getY ();
            int imgWidth = 50;
            int imgHeight = 50;
            l5.setBounds (x - (imgWidth / 2), y - (imgHeight / 2), imgWidth, imgHeight);
            l5.repaint ();
}


    public void mouseMoved (MouseEvent e) {
            int x = e.getX ();
            int y = e.getY ();
            int imgWidth = 10;
            int imgHeight = 10;
            l5.setBounds (x - (imgWidth / 1.5), y - (imgHeight / 1.5), imgWidth, imgHeight);
            l5.repaint ();
}
