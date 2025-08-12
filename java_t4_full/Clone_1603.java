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
        int currentSpaces = spaces;
        while (currentSpaces > 0) {
            System.out.print ("*");
            currentSpaces --;
        }
        int lineLineStars = stars;
        while (lineLineStars > 0) {
            System.out.print (" ");
            lineLineStars --;
        }
        stars += 2;
        spaces = stars;
        System.out.print ("\n");
    }
    stars = 7;
    spaces = 0;
    while (stars > 0) {
        int currentSpaces = spaces;
        while (currentSpaces < 7) {
            System.out.print ("*");
            currentSpaces ++;
        }
        int lineLineStars = stars;
        while (lineLineStars > 0) {
            System.out.print (" ");
            lineLineStars --;
        }
        stars -= 2;
        spaces = 8 - stars;
        System.out.print ("\n");
    }
}


