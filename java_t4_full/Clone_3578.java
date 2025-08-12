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





public static void print(Object... objects) {
            for (Object object : objects) {
                System.out.println(object);
            }
        }

        public static void print(int[]... arrays) {
            for (int[] array : arrays) {
                System.out.println(Arrays.toString(array));
            }
        }

        public static void print(double[]... arrays) {
            for (double[] array : arrays) {
                System.out.println(Arrays.toString(array));
            }
        }

        public static void print(Object[]... arrays) {
            for (Object[] array : arrays) {
                System.out.println(Arrays.deepToString(array));
            }
}


