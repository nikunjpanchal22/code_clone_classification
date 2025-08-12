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
    while (stars < 8) {
        for (int i = 0; i < 7 - stars; i++) {
            System.out.print ("*");
        }
        int currentSpaces = stars;
        while (currentSpaces > 0) {
            System.out.print (" ");
            currentSpaces--;
        }
        stars += 2;
        System.out.println ();
    }
    stars = 7;
    while (stars > 0) {
        for (int i = 0; i < 8 - stars; i++) {
            System.out.print ("*");
        }
        int currentSpaces = stars;
        while (currentSpaces > 0) {
            System.out.print (" ");
            currentSpaces--;
        }
        stars -= 2;
        System.out.println ();
    }
}


