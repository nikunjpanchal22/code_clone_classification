static void stars () {
    final int MAX_WIDTH = 7;
    for (int i = 0;
    i < 7; ++ i) {
        int width;
        if (i < 3) width = MAX_WIDTH - i * 2;
        else if (i > 3) width = (i - 3) * 2 + 1;
        else width = 1;
        for (int j = 0;
        j < (MAX_WIDTH - width) / 2; ++ j) {
            System.out.print (" ");
        }
        for (int j = 0;
        j < width; ++ j) {
            System.out.print ("*");
        }
        for (int j = 0;
        j < (MAX_WIDTH - width) / 2; ++ j) {
            System.out.print (" ");
        }
        System.out.println ();
    }
}


  static void stars() {
    int MAX_WIDTH = 7;
    for (int i = 0; i < MAX_WIDTH; i++) {
        int width;
        if (i < 3) {
            width = MAX_WIDTH - i * 2;
        } else if (i > 3) {
            width = (i - 3) * 2 + 1;
        } else {
            width = 1;
        }
        int numSpaces = MAX_WIDTH - width;
        final int numFrontSpaces = numSpaces / 2;
        final int numBackSpaces = numSpaces - numFrontSpaces;
        System.out.println(repeat(' ', numFrontSpaces) + repeat('*', width) + repeat(' ', numBackSpaces));
    }
}


