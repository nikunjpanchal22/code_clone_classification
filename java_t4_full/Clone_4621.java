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




public static void main(String [] args) {
            System.out.println("Please enter the red color. Range [0, 255] only please.");
            int red = new Scanner(System.in).nextInt();
            int code = Color(red, GetColor("green"), GetColor("blue"));
            PrintColor("The code is "+code+". Your red value is: ", (code&0xFF0000)>>16);
            PrintColor("Your green value is: ", (code&0xFF00)>>8);
            PrintColor("Your blue value is: ", code&0xFF);
        }
        static int GetColor(String val){
            System.out.println("Please enter the "+val+" color. Range [0, 255] only please.");
            return new Scanner(System.in).nextInt();
        }
        static int Color(int r, int g, int b){
            return (r << 16) | (g << 8) | b;
        }
        static void PrintColor(String val, int col){
            System.out.println(val+col);
}


