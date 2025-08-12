public static void main (String [] args) {
    for (int row = 1;
    row <= 7; row += 2) {
        for (int space = 7;
        space >= row; space -= 2) {
            System.out.print ("*");
        }
        for (int i = 1;
        i <= row; i ++) {
            System.out.print (" ");
        }
        System.out.print ("\n");
    }
    for (int row = 5;
    row >= 1; row -= 2) {
        for (int space = 7;
        space >= row; space -= 2) {
            System.out.print ("*");
        }
        for (int i = 1;
        i <= row; i ++) {
            System.out.print (" ");
        }
        System.out.print ("\n");
    }
}


 public static void main (String [] args) {
    int stars = 0;
    int spaces = 7;
    while (stars < 8) {
        for (int i = spaces; i > 0; i--) {
            System.out.print ("*");
        }
        for (int i = 0; i < stars; i++) {
            System.out.print (" ");
        }
        stars += 2;
        spaces = stars;
        System.out.println ();
    }
    stars = 7;
    spaces = 0;
    while (stars > 0) {
        for (int i = 0; i < spaces; i++) {
            System.out.print ("*");
        }
        for (int i = stars; i > 0; i--) {
            System.out.print (" ");
        }
        stars -= 2;
        spaces = 8 - stars;
        System.out.println ();
    }
}


