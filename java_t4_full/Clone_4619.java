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




public static void main (String [] args){
            int red=askRGB("red");
            int green=askRGB("green");
            int blue=askRGB("blue");
            int code = (red<<16) | (green<<8) | blue;
            System.out.println("The code is "+code);
            showColors("red", (code & 0xFF0000)>>16);
            showColors("green", (code & 0xFF00)>>8);
            showColors("blue", code & 0xFF);
        }
        static int askRGB(String color){
            System.out.println("Please enter the "+color+" color. Range [0, 255] only please.");
            return new Scanner(System.in).nextInt();
        }
        static void showColors(String color, int code){
            System.out.println("Your "+color+" value is: "+code);
}


