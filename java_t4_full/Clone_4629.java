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
            int red=readRGB("red");
            int green=readRGB("green");
            int blue=readRGB("blue");
            int code = (red<<16) | (green<<8) | blue;
            System.out.println("The code is "+code);
            outColor("red", (code & 0xFF0000)>>16);
            outColor("green", (code & 0xFF00)>>8);
            outColor("blue", code & 0xFF);
        }
        public static int readRGB(String color){
            System.out.println("Please enter the "+color+" color. Range [0, 255] only please.");
            return new Scanner(System.in).nextInt();
        }
        public static void outColor(String color, int value){
            System.out.println("Your "+color+" value is: "+value);
}


