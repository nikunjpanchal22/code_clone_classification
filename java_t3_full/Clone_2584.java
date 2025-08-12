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






public static void print(Object... toPrint) {
    for (Object item : toPrint) {
        if (item instanceof int[]) {
            System.out.println(Arrays.toString((int[]) item));
        } else if (item instanceof Integer[]) {
            System.out.println(Arrays.toString((Integer[]) item));
        } else if (item instanceof double[]) {
            System.out.println(Arrays.toString((double[]) item));
        } else if (item instanceof String[]) {
            System.out.println(Arrays.toString((String[]) item));
        } else if (item instanceof Object[]) {
            System.out.println(Arrays.deepToString((Object[]) item));
        } else {
            System.out.println(item);
        }
    }
}


