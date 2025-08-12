public static void main (String [] args) {
    try {
        Robot robot = new Robot ();
        BufferedImage bi = robot.createScreenCapture (new Rectangle (Toolkit.getDefaultToolkit ().getScreenSize ()));
        ImageIO.write (bi, "jpg", new File ("C:/imageTest.jpg"));
    } catch (AWTException e) {
        e.printStackTrace ();
    } catch (IOException e) {
        e.printStackTrace ();
    }
}




public static void main(String[] args) {
    try {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();
        for (GraphicsDevice g: gs) {
            Robot robot = new Robot(g);
            Rectangle bounds = g.getDefaultConfiguration().getBounds();
            BufferedImage bi = robot.createScreenCapture(bounds);
            ImageIO.write(bi, "jpg", new File("C:/imageTest.jpg"));
        }
    } catch (AWTException|IOException e) {
        e.printStackTrace();
    }
}


