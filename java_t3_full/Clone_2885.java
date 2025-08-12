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
        Robot robot = new Robot();
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        BufferedImage bi = robot.createScreenCapture(new Rectangle(gd.getDisplayMode().getWidth(), gd.getDisplayMode().getHeight()));
        ImageIO.write(bi, "jpg", new File("C:/imageTest.jpg"));
    } catch (AWTException|IOException e) {
        e.printStackTrace();
    }
}


