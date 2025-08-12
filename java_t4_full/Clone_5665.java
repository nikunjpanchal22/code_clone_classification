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
            StringBuilder sb = new StringBuilder();
            for (int row = 1; row <= 7; row += 2) {
                getPattern(sb, row, 7);
            }
            for (int row = 5; row >= 1; row -= 2) {
                getPattern(sb, row, 7);
            }
            System.out.println(sb);
        }

        public static void getPattern(StringBuilder sb, int row, int total){
            for (int i = total; i >= row; i -= 2){
                sb.append("*");
            }
            for (int i = 1; i <= row; i++){
                sb.append(" ");
            }
            sb.append("\n");
}


