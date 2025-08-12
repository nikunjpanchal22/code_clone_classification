public static void main (String args []) {
    Scanner sc = new Scanner (System.in);
    ArrayList < Integer > l = new ArrayList < Integer > (10);
    for (int i = 0;
    i < 10; i ++) l.add (sc.nextInt ());
    Collections.shuffle (l);
    for (int j = 0;
    j < 10; j ++) System.out.println (l.get (j));
}


 public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>(10);
    for (int i = 0; i < 10; i++)
        list.add(sc.nextInt());

    // Fisher-Yates Shuffle
    for (int i = list.size() - 1; i > 0; i--) {
        int index = (int)(Math.random() * (i + 1));
        int temp = list.get(index);
        list.set(index, list.get(i));
        list.set(i, temp);
    }

    for (int i = 0; i < 10; i++) {
        System.out.println(list.get(i));
    }

}


