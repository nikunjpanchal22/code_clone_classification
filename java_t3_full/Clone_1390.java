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
       Dimension returnDimension = Toolkit.getDefaultToolkit().getScreenSize(); 
       Rectangle rect = new Rectangle(returnDimension); 
       BufferedImage bi = robot.createScreenCapture(rect); 
       ImageIO.write(bi, "JPG", new File("C:/Ascreenshot.jpg")); 
   } catch (AWTException ex) { 
       ex.printStackTrace(); 
   } catch (IOException ex) { 
       ex.printStackTrace(); 
   }
}


