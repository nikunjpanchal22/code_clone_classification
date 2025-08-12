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
        Robot robot = new Robot(0);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        Rectangle rectangle = new Rectangle(0,0,d.width,d.height);
        BufferedImage bi = robot.createScreenCapture(rectangle);
        ImageIO.write(bi, "jpg", new File("C:/imageTest.jpg"));
    } catch (AWTException|IOException e) {
        e.printStackTrace();
    }
}


