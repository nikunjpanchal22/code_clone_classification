public static void print (Object...toPrint) {
    for (Object item : toPrint) {
        if (item.getClass () == int [].class) {
            System.out.println (Arrays.toString ((int []) item));
        } else if (item.getClass () == double [].class) {
            System.out.println (Arrays.toString ((double []) item));
        } else if (item instanceof Object []) {
            System.out.println (Arrays.toString ((Object []) item));
        } else {
            System.out.println (item);
        }
    }
}


 public static void print (Object...toPrint) {
    for (Object item : toPrint) {
        if (item.getClass () == Boolean [].class) {
            System.out.println (Arrays.toString ((Boolean []) item));
        } else if (item.getClass () == Byte [].class) {
            System.out.println (Arrays.toString ((Byte []) item));
        } else if (item instanceof Object []) {
            System.out.println (Arrays.toString ((Object []) item));
        } else {
            System.out.println (item);
        }
    }
}


