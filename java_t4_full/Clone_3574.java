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
    Map<Class<?>, Consumer<Object>> printActions = new HashMap<>();
    printActions.put(int[].class, obj -> System.out.println(Arrays.toString((int[])obj)));
    printActions.put(double[].class, obj -> System.out.println(Arrays.toString((double[])obj)));
    printActions.put(Object[].class, obj -> System.out.println(Arrays.toString((Object[])obj)));

    for (Object item : toPrint) {
        printActions.getOrDefault(item.getClass(), System.out::println).accept(item);
    }
}


