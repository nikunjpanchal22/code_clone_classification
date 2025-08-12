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




public static void main (String[] args) {
        pattern('*', ' ', 1, 7, 2, 7, 2, 1, "\n");
        pattern('*', ' ', 5, 1, -2, 7, 2, 1, "\n");
    }
    public static void pattern(char firstChar, char secondChar, int start, int stop, int increment, int spaceStart, int spaceEnd, int spaceIncrement, String endLine){
        for(int row = start; row != stop + increment; row += increment) {
            for(int space = spaceStart; space >= row; space -= spaceIncrement) System.out.print(firstChar);
            for(int i = 1; i <= row; i++) System.out.print(secondChar);
            System.out.print(endLine);
        }
}


