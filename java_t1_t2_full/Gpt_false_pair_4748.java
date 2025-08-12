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
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.println ("enter size of the array");
    int arraySize = Integer.parseInt (br.readLine ());
    int array [] = new int [arraySize];
    for (int index = 0; 
    index < arraySize; index ++) {
        System.out.println ("enter a element");
        int element = Integer.parseInt (br.readLine ());
        array [index] = element;
    }
    for (int index = 0;
    index < arraySize; index ++) {
        for (int jIndex = 0;
        jIndex < arraySize - 1; jIndex ++) {
            if (array [jIndex] > array [jIndex + 1]) {
                int tempValue = array [jIndex];
                array [jIndex] = array [jIndex + 1];
                array [jIndex + 1] = tempValue;
            }
        }
    }
    int bIndex = 0;
    array [bIndex] = array [0];
    for (int index = 1; 
    index < arraySize; index ++) {
        if (array [bIndex] != array [index]) {
            bIndex ++;
            array [bIndex] = array [index];
        }
    }
    for (int index = 0;
    index <= bIndex; index ++) {
        System.out.println (array [index]);
    }
}
