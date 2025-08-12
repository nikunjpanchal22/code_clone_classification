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
    Scanner cin = new Scanner(System.in);
    System.out.println ("enter size of the array");
    int l = cin.nextInt ();
    int [] a = new int [l];
    for (int i = 0; i < l; i++) {
        System.out.println ("enter a element");
        int el = cin.nextInt();
        a [i] = el;
    }
    Arrays.sort(a);
    a = IntStream.of(a).distinct().toArray();
    for (int value : a) System.out.println(value);
}


