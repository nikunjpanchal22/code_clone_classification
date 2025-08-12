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




public static void main(String[] args) throws AWTException, IOException {
    Robot robot = new Robot();
    Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
    BufferedImage bi = robot.createScreenCapture(screenRect);
    File output = new File("C:/imageTest.jpg");
    ImageIO.write(bi, "jpg", output);
}


