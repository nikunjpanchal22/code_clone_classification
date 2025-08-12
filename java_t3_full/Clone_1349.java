public static void main (String [] args) {
    List < String > keywords = Arrays.asList ("Apple", "Ananas", "Mango", "Banana", "Beer");
    Map < Character, List < String > > result = new HashMap < Character, List < String > > ();
    for (String k : keywords) {
        char firstChar = k.charAt (0);
        if (! result.containsKey (firstChar)) {
            result.put (firstChar, new ArrayList < String > ());
        }
        result.get (firstChar).add (k);
    }
    for (List < String > list : result.values ()) {
        Collections.sort (list);
    }
    System.out.println (result);
}


 public static void main (String [] args) {
    List<String> keywords = Arrays.asList("Apple", "Ananas", "Mango", "Banana", "Beer");
    HashMap<Character, List<String>> result = new HashMap<>();
    for(String k : keywords) {
        char firstChar = k.charAt(0);
        if(result.get(firstChar) == null)
            result.put(firstChar, new ArrayList<>());
        result.get(firstChar).add(k);
    }
    result.values().forEach(list -> Collections.sort(list));
    System.out.println(result);
}


