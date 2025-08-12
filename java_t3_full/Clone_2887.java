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
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        BufferedImage bi = robot.createScreenCapture(new Rectangle(screenSize));
        ImageIO.write(bi, "jpg", new File("C:/imageTest.jpg"));
    } catch (AWTException|IOException e) {
        e.printStackTrace();
    }
}


