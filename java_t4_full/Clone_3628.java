public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    String [] [] array = new String [7] [];
    array [0] = new String [] {"continents", "Asia", "Europe", "Africa", "Australia", "South America", "North America"};
    array [1] = new String [] {"profession", "teacher", "doctor", "lawyer"};
    array [2] = new String [] {"brand", "apple", "samsung"};
    array [3] = new String [] {"name", "lisa", "peter", "sam", "jack"};
    array [4] = new String [] {"profession", "engineer", "Professor", "Dentist", "Driver"};
    array [5] = new String [] {"sex", "value", "male", "female"};
    array [6] = new String [] {"exp", "value", "1", "2", "3", "4"};
    int index = sc.nextInt ();
    String [] tempReference = array [index - 1];
    for (int i = index - 1;
    i < array.length - 1; i ++) {
        array [i] = array [i + 1];
    }
    array [array.length - 1] = tempReference;
    for (String [] tempArray : array) {
        for (String s : tempArray) {
            System.out.print (s + " ");
        }
        System.out.println ();
    }
}





public static void main(String[] args) {
    final int COUNT = 7;
    Scanner sc = new Scanner(System.in);
    LinkedHashMap<String, TreeSet<String>> treesetArray = new LinkedHashMap<String, TreeSet<String>>();
    for (int i = 0; i < COUNT; i++) {
        String category = sc.next();
        int n = sc.nextInt();
        TreeSet<String> set = new TreeSet<String>();
        for (int j = 0; j < n; j++) {
            set.add(sc.next());
        }
        treesetArray.put(category, set);
    }
    treesetArray.forEach((key, value) -> System.out.println(key + " " + value));
}


