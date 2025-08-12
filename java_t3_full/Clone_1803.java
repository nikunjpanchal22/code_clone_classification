public static void main (String [] args) {
    Map < String, Integer > unique = new LinkedHashMap < String, Integer > ();
    for (String string : "House, House, House, Dog, Dog, Dog, Dog".split (", ")) {
        if (unique.get (string) == null) unique.put (string, 1);
        else unique.put (string, unique.get (string) + 1);
    }
    String uniqueString = join (unique.keySet (), ", ");
    List < Integer > value = new ArrayList < Integer > (unique.values ());
    System.out.println ("Output = " + uniqueString);
    System.out.println ("Values = " + value);
}


 public static void main(String[] args) {
    Map<String, Integer> quantity = new HashMap<String, Integer>();
    for (String s : "House, House, House, Dog, Dog, Dog, Dog".split(", ")) {
        if (quantity.containsKey(s))
            quantity.put(s, quantity.get(s) + 1);
        else
            quantity.put(s, 1);
    }
    String outputSentence = String.join(", ", quantity.keySet());
    List <Integer> numericals = new ArrayList<Integer>(quantity.values());
    System.out.println("Output = " + outputSentence);
    System.out.println("Values = " + numericals);
}


