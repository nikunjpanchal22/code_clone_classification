public static int TestTryFinallyBlock () {
    int i = 0;
    try {
        i = 10;
        return i;
    } finally {
        i = 40;
        System.out.println ("local: " + i);
    }
}


public static int TestTryFinallyBlock () {
    int i = 0;
    try {
        i = 20;
        return i;
    } finally {
        i = 60;
        System.out.println ("local: " + i);
    }
}
