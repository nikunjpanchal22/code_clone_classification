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





public static void main(String[] args) throws IOException {
    System.out.println("Enter size of array: ");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    HashSet<Integer> a = new LinkedHashSet<>();
    for (int i = 0; i < n; ++i) {
        System.out.println("Enter element: ");
        int x = Integer.parseInt(in.readLine());
        a.add(x);
    }
    a.stream().sorted().forEach(System.out::println);
}


