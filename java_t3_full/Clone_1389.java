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


 public static void main (String [] args) {try { 
        Robot robot = new Robot(); 
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); 
        Rectangle captureRect = new Rectangle(0, 0, dim.width, dim.height); 
        BufferedImage bi = robot.createScreenCapture(captureRect); 
        ImageIO.write(bi, "jpg", new File("/Users/example/Desktop/images.jpg")); 
    } catch (AWTException e) { 
        e.printStackTrace(); 
    } catch (IOException e) { 
        e.printStackTrace(); 
    }
}


