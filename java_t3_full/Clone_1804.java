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


 public static void main(String[] args){
    Map<String, Integer> tables = new LinkedHashMap<String, Integer>();
    for(String s : "House, House, House, Dog, Dog, Dog, Dog".split(", ")){
        if(tables.containsKey(s))
            tables.put(s, tables.get(s) + 1);
        else
            tables.put(s, 1);
    }
    String outputString = String.join(", ", tables.keySet());
    List<Integer> counts = new ArrayList<Integer>(tables.values());
    System.out.println("Output = " + outputString);
    System.out.println("Values = " + counts);
}


