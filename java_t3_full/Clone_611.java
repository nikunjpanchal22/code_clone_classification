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
        if (item.getClass () == Integer [].class) {
            System.out.println (Arrays.toString ((Integer []) item));
        } else if (item.getClass () == Long [].class) {
            System.out.println (Arrays.toString ((Long []) item));
        } else if (item instanceof Object []) {
            System.out.println (Arrays.toString ((Object []) item));
        } else {
            System.out.println (item);
        }
    }
}


