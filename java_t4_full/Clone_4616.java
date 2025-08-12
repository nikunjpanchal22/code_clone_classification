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
    String [] data = new String []{"red", "green", "blue"};
    int [] colors = new int[3];
    int [] mask = new int[]{0xFF0000, 0xFF00, 0xFF};
    int code = 0;
    for(int i=0;i<3;i++){
        System.out.println ("Please enter the "+data[i]+" color. Range [0, 255] only please.");
        colors[i] = scan.nextInt ();
        code |= colors[i] << (16-(8*i));
    }
    System.out.println ("The code is " + code + ".");
    for(int i=0;i<3;i++)
        System.out.println ("Your "+data[i]+" value is: " + ((code & mask[i]) >> (16-(8*i))));
}


