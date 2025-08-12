public static void main (String args []) throws Exception {
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.println ("enter size of the array");
    int l = Integer.parseInt (br.readLine ());
    int [] a = new int [l];
    for (int i = 0;
    i < l; i ++) {
        System.out.println ("enter a element");
        int el = Integer.parseInt (br.readLine ());
        a [i] = el;
    }
    for (int i = 0;
    i < l; i ++) {
        for (int j = 0;
        j < l - 1; j ++) {
            if (a [j] > a [j + 1]) {
                int temp = a [j];
                a [j] = a [j + 1];
                a [j + 1] = temp;
            }
        }
    }
    int b = 0;
    a [b] = a [0];
    for (int i = 1;
    i < l; i ++) {
        if (a [b] != a [i]) {
            b ++;
            a [b] = a [i];
        }
    }
    for (int i = 0;
    i <= b; i ++) {
        System.out.println (a [i]);
    }
}


public static void main (String args []) throws Exception {
    BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
    System.out.println ("enter size of the array");
    int length = Integer.parseInt (reader.readLine ());
    int array [] = new int [length];
    for (int i = 0;
    i < length; i ++) {
        System.out.println ("enter a element");
        int element = Integer.parseInt (reader.readLine ());
        array [i] = element;
    }
    for (int i = 0;
    i < length; i ++) {
        for (int j = 0;
        j < length - 1; j ++) {
            if (array [j] > array [j + 1]) {
                int temp = array [j];
                array [j] = array [j + 1];
                array [j + 1] = temp;
            }
        }
    }
    int b = 0;
    array [b] = array [0];
    for (int i = 1;
    i < length; i ++) {
        if (array [b] != array [i]) {
            b ++;
            array [b] = array [i];
        }
    }
    for (int i = 0;
    i <= b; i ++) {
        System.out.println (array [i]);
    }
}
