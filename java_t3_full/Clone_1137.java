public static void main (String [] args) {
    Scanner scan = new Scanner (System.in);
    int code;
    int red, green, blue;
    int rMask = 0xFF0000, gMask = 0xFF00, bMask = 0xFF;
    System.out.println ("Please enter the red color. Range [0, 255] only please.");
    red = scan.nextInt ();
    System.out.println ("Please enter the green color. Range [0, 255] only please.");
    green = scan.nextInt ();
    System.out.println ("Please enter the blue color. Range [0, 255] only please.");
    blue = scan.nextInt ();
    code = 0;
    code += (int) (red * Math.pow (2, 16));
    code += (int) (green * Math.pow (2, 8));
    code += (int) (blue * Math.pow (2, 0));
    System.out.println ("The code is " + code + ".");
    red = 0;
    green = 0;
    blue = 0;
    red = (code & rMask)>> 16;
    green = (code & gMask)>> 8;
    blue = (code & bMask);
    System.out.println ("Your red value is: " + red);
    System.out.println ("Your green value is: " + green);
    System.out.println ("Your blue value is: " + blue);
}


 public static void main (String [] args) {
    Scanner scan = new Scanner (System.in);
    int code;
    int red, green, blue;
    int rMask = 0xFF0000, gMask = 0xFF00, bMask = 0xFF;
    System.out.println ("Please enter the red value. Range [0, 255] only please.");
    red = scan.nextInt ();
    System.out.println ("Please enter the green value. Range [0, 255] only please.");
    green = scan.nextInt ();
    System.out.println ("Please enter the blue value. Range [0, 255] only please.");
    blue = scan.nextInt ();
    code = (red * (1 << 16)) + (green * (1 << 8)) + blue;
    System.out.println ("The code is " + code + ".");
    red = (code & rMask) >> 16;
    green = (code & gMask) >> 8;
    blue = code & bMask;
    System.out.println ("Your red value is: " + red);
    System.out.println ("Your green value is: " + green);
    System.out.println ("Your blue value is: " + blue);
}


